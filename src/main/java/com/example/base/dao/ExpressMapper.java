package com.example.base.dao;

import com.example.base.model.dto.ExpressDto;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/16 10:47
 */
@Repository
@CacheConfig(cacheNames = "cache_express")
public interface ExpressMapper {

    @Cacheable
    ExpressDto selectById(Long id);

    @CachePut(key = "#express.id")
    int insertExpress(ExpressDto express);

    @CacheEvict(key = "#id")
    int deleteById(Long id);
}
