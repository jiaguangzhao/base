package com.example.base;

import lombok.*;

import java.io.Serializable;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/8 19:39
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExcelModel implements Serializable {

    private String id;
    private String username;
    private String password;
    private String email;
}
