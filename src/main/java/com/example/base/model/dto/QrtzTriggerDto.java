package com.example.base.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 触发器
 */
@Getter
@Setter
@ToString
@Alias("qrtzTrigger")
public class QrtzTriggerDto implements Serializable {


    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private String jobName;

    private String jobGroup;

    private String description;

    private Long nextFireTime;

    private Long prevFireTime;

    private Integer priority;

    private String triggerState;

    private String triggerType;

    private Long startTime;

    private Long endTime;

    private String calendarName;

    private Short misfireInstr;

    private byte[] jobData;

    private Integer status;

    public QrtzTriggerDto() {
    }
}