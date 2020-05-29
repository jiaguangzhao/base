package com.example.base.aio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/10 12:28
 */
@Slf4j
public class AIOServer {

    private final int port;

    public AIOServer(int port){
        this.port = port;
        listen();
    }

    public static void main(String[] args) {
//        new RandomAccessFile().getChannel();
        int port = 8080;
        new AIOServer(port);
    }

    private void listen(){
        ExecutorService executorService = Executors.newCachedThreadPool();

        try {
            AsynchronousChannelGroup group = AsynchronousChannelGroup.withCachedThreadPool(executorService, 1);
            final AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel.open(group);
            serverSocketChannel.bind(new InetSocketAddress(port));
            log.info("服务已启动，监听端口【{}】。", port);

            serverSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {

                final ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);

                @Override
                public void completed(AsynchronousSocketChannel result, Object attachment) {
                    log.info("IO操作成功，开始获取数据。");
                    byteBuffer.clear();
                    try {
                        result.read(byteBuffer).get();
                        byteBuffer.flip();
                        result.write(byteBuffer);
                        byteBuffer.flip();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            result.close();
                            serverSocketChannel.accept(null, this);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    log.info("操作完成。");
                }

                @Override
                public void failed(Throwable exc, Object attachment) {
                    log.info("IO操作失败【{}】。", exc.getMessage(), exc);
                }
            });
            try {
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
