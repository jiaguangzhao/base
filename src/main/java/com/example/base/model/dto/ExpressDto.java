package com.example.base.model.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 10:45
 */
@Data
@Alias("express")
public class ExpressDto implements Serializable {

    private Long id;

    private String expressCode;

    private String expressName;
}