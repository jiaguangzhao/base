package com.example.base.aop.configure;

import com.example.base.controller.job.DemoQuartzJob;
import org.quartz.*;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:53
 */
@Configuration
public class QuartzConfiguration {

    @Bean
    public JobDetail demoJob(){
        return JobBuilder.newJob(DemoQuartzJob.class).withIdentity("demoQuartzJob").storeDurably().build();
    }
//
    @Bean
    public Trigger demoTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        Trigger trigger = TriggerBuilder.newTrigger().forJob(demoJob()).withIdentity("demoTrigger").withSchedule(simpleScheduleBuilder).build();
        return trigger;
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.example.base.controller.job.DemoQuartzJob");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //SchedulerFactoryBean schedulerFactoryBean;
        //afterPropertiesSet(); -- registerJobsAndTriggers();
        // getScheduler().addJob(jobDetail, true);
        try {
            JobBuilder.newJob((Class<QuartzJobBean>) Class.forName("com.example.base.controller.job.DemoQuartzJob")).withIdentity("demoQuartzJob").storeDurably().build();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "https://swy.lzlj.com/oauth2/authorize?username=jagger&password=123456&userType=B&client_id=BWd486730b9faa4a70b760730c636e68&response_type=code&redirect_uri=http%3a%2f%2fswy.lzlj.com%2foauth2%2fgetToken";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForEntity(url, null, String.class).getBody();
        System.out.println(response);

        QuartzAutoConfiguration quartzAutoConfiguration;

//        try {
//            String url = URLDecoder.decode("http://swy.lzlj.com/oauth2/authorize?username=jagger&password=123456&userType=B&client_id=BWd486730b9faa4a70b760730c636e68&response_type=code&redirect_uri=http%3a%2f%2fswy.lzlj.com%2foauth2%2fgetToken", StandardCharsets.UTF_8.name());
//            System.out.println(url);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }


    }
}