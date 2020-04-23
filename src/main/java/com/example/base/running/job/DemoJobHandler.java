package com.example.base.running.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/14 10:05
 */
@Component
@Slf4j
public class DemoJobHandler {

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler(String param) throws Exception {
        LocalDateTime localDateTime = LocalDateTime.now();
        for (int i = 0; i < 5; i++) {
            log.info("我操了个DJ：time【{}】i【{}】。", localDateTime, i);
            TimeUnit.SECONDS.sleep(5);
        }
        return ReturnT.SUCCESS;
    }


    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler02")
    public ReturnT<String> demoJobHandler02(String param) throws Exception {
        LocalDateTime localDateTime = LocalDateTime.now();
        for (int i = 0; i < 5; i++) {
            log.info("什么几把：time【{}】i【{}】。", localDateTime, i);
            TimeUnit.SECONDS.sleep(3);
        }
        int i = new Random().nextInt(100);
        if (i < 20) {
            int j = 0;
            j = i / j;
        } else if (i < 40) {
            return new ReturnT<>(i, "我爱你吗：" + i);
        }
        return ReturnT.SUCCESS;
    }
}
