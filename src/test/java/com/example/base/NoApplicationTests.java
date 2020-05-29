package com.example.base;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.File;
import java.io.IOException;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/8 19:36
 */
@Slf4j
public class NoApplicationTests {

    @Test
    public void test001(){
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }

    @Test
    public void test002(){
        log.info("这是为什么呢？");
    }

    @Test
    public void test003(){
        log.info("测试只提交github");
    }

    @Test
    public void test004(){
        log.info("都提交");
        StringRedisTemplate stringRedisTemplate;
    }

    @Test
    public void test005(){
        AsynchronousServerSocketChannel asynchronousServerSocketChannel;
        AsynchronousSocketChannel asynchronousSocketChannel;
        CompletionHandler completionHandler;

    }

    @Test
    public void test006() throws IOException {
        String fileN = "C:\\Users\\Admin\\Desktop\\merge\\merge.pdf";
        PdfDocument pdfDocument = new PdfDocument(new PdfWriter(fileN));
        Document document = new Document(pdfDocument, PageSize.A4);
        document.setTopMargin(0);
        document.setLeftMargin(0);
        document.setRightMargin(0);
        document.setBottomMargin(0);

        File file = new File("C:\\Users\\Admin\\Desktop\\merge");
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            byte[] result = Files.readAllBytes(Paths.get("C:\\Users\\Admin\\Desktop\\merge\\" + files[i]));
            if (result != null){
                if (isPicture(result)) {
                    ImageData imageData = ImageDataFactory.create(result);
                    Image image = new Image(imageData);
                    document.add(image);
                } else {
                    log.info("单据【{}】文件【{}, {}】非图片文件，跳过合并。", "jia", "guang", "zhao");
                }
            }
        }


        document.close();
    }

    public static boolean isPicture(byte[] bytes) {

        if (bytes == null || bytes.length < 4) {
            return false;
        } else {
            byte[] bytes1 = new byte[4];
            for (int i = 0; i < 4; i++) {
                bytes1[i] = bytes[i];
            }
            String hexString = Hex.encodeHexString(bytes1).toUpperCase();
            if (hexString.contains("FFD8FF") || hexString.contains("89504E47")
                    || hexString.contains("47494638") || hexString.contains("424D")) {
                // jpg  png  gif  bmp
                return true;
            } else {
                return false;
            }
        }
    }
}
