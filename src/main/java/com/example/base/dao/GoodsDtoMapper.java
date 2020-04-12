package com.example.base.dao;

import com.example.base.model.dto.GoodsDto;
import com.example.base.model.dto.GoodsDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsDtoMapper {
    long countByExample(GoodsDtoExample example);

    int deleteByExample(GoodsDtoExample example);

    int insert(GoodsDto record);

    int insertSelective(GoodsDto record);

    List<GoodsDto> selectByExample(GoodsDtoExample example);

    int updateByExampleSelective(@Param("record") GoodsDto record, @Param("example") GoodsDtoExample example);

    int updateByExample(@Param("record") GoodsDto record, @Param("example") GoodsDtoExample example);
}