package com.example.base.service.impl;

import com.example.base.dao.ExpressMapper;
import com.example.base.model.dto.ExpressDto;
import com.example.base.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 11:37
 */
@Service
public class ExpressServiceImpl implements ExpressService {

    @Autowired
    private ExpressMapper expressMapper;

    public ExpressServiceImpl() {
    }

    @Override
    @Transactional
    public ExpressDto selectById(Long id) {
        return expressMapper.selectById(id);
    }
}
