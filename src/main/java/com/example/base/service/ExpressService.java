package com.example.base.service;

import com.example.base.model.dto.ExpressDto;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 11:37
 */
public interface ExpressService {

    ExpressDto selectById(Long id);
}