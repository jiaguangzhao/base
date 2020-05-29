package com.example.base.aop;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;
import org.flowable.task.service.impl.persistence.entity.TaskEntityImpl;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/2/26 10:22
 */
public class LogbackMessageConverter extends MessageConverter {


    @Autowired
    private ObjectMapper objectMapper;

    public LogbackMessageConverter() {
    }

    @Override
    public String convert(ILoggingEvent event) {

        String loggerName = event.getLoggerName();
        // 上传文件不打印文件信息。
        if (loggerName.contains("com.baiwang.bigcustomer.client.BWRestClient") && event.getMessage().contains("baiwang.image.file.upload")) {
            String message = event.getMessage().replaceFirst("\"file_data\":\"(.)+\"} >> ",
                    " \"file_data\":\"(该接口为文件上传接口跳过报文打印)\"} >> ");
            return message;
        }
        // 如果参数为空，不改变信息。
        if (Objects.isNull(event.getArgumentArray())) {
            return super.convert(event);
        }
        try {
//            MessageFormatter.arrayFormat(event.getMessage(), Stream.of(event.getArgumentArray())
//                    .map(JSON::toJSONString).toArray()).getMessage();
            // 更改打印信息。
            String message = MessageFormatter.arrayFormat(event.getMessage(), Stream.of(event.getArgumentArray())
                    .map(o -> {
                        if (o instanceof String) {
                            return o;
                        } else {
//                            objectMapper.writeValueAsString(o)
//                            return o.toString();
                            if (o instanceof TaskEntity) {
                                return o.toString();
                            }
                            return JSONObject.toJSONString(o, SerializerFeature.DisableCircularReferenceDetect);
                        }
                    }).toArray()).getMessage();
            return message;

        } catch (Exception e) {
            e.printStackTrace();
            return super.convert(event);
        }
    }
}
