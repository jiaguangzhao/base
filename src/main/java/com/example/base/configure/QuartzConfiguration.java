package com.example.base.configure;
/**
import com.example.base.running.job.DemoQuartzJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
*/
/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 14:53
 */
/**
@Configuration
public class QuartzConfiguration {

    @Bean
    public JobDetail demoJob(){
        return JobBuilder.newJob(DemoQuartzJob.class).withIdentity("demoQuartzJob").storeDurably().build();
    }

    @Bean
    public Trigger demoTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        return TriggerBuilder.newTrigger().forJob(demoJob()).withIdentity("demoTrigger").withSchedule(simpleScheduleBuilder).build();
    }
}
*/