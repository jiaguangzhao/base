package com.example.base.dao;

import com.example.base.model.dto.QrtzTriggerDto;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "cache_trigger")
public interface QrtzTriggerDtoMapper {

    /**
     * 查询所有trigger
     * @return
     */
    @Cacheable
    List<QrtzTriggerDto> selectAll();

    /**
     * 根据名称查询触发器
     * @param triggerName
     * @return
     */
    @Cacheable
    QrtzTriggerDto selectByTriggerName(String triggerName);

    /**
     *
     * @param qrtzTriggerDto
     * @return
     */
    @CachePut(key = "#qrtzTrigger.triggerName")
    int insertQrtzTrigger(QrtzTriggerDto qrtzTriggerDto);

    /**
     * 更新trigger
     * @param qrtzTriggerDto
     * @return
     */
    @CacheEvict(key = "#qrtzTrigger.triggerName")
    int updateById(QrtzTriggerDto qrtzTriggerDto);
}