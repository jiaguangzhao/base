package com.example.base.aio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/10 12:48
 */
@Slf4j
public class AIOClient {

    private final AsynchronousSocketChannel asynchronousSocketChannel;

    public AIOClient() throws IOException {
        this.asynchronousSocketChannel = AsynchronousSocketChannel.open();
    }

    public void connect(String host, int port) throws Exception {
        asynchronousSocketChannel.connect(new InetSocketAddress(host, port), null, new CompletionHandler<Void, Void>() {
            @Override
            public void completed(Void result, Void attachment) {
                try {
                    asynchronousSocketChannel.write(ByteBuffer.wrap("我是贾广召".getBytes())).get();
                    log.info("已发送我是贾广召。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void failed(Throwable exc, Void attachment) {
                log.info("发送失败【{}】。", exc.getMessage(), exc);
            }
        });
        final ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        asynchronousSocketChannel.read(byteBuffer, null, new CompletionHandler<Integer, Object>() {
            @Override
            public void completed(Integer result, Object attachment) {
                log.info("IO操作完成【{}】，返回结果【{}】。", result, new String(byteBuffer.array()));
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                log.info("读取异常【{}】。", exc.getMessage(), exc);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        new AIOClient().connect("localhost", 8080);
    }
}
