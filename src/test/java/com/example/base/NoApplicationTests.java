package com.example.base;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/4/8 19:36
 */
@Slf4j
public class NoApplicationTests {

    @Test
    public void test001(){
        String fileName = "D:\\work\\baiwang\\勾选发票列表.xlsx";
        String templateFileName = "D:\\work\\baiwang\\taxReturnDeductTemplate.xlsx";
        List<ExcelModel> data = new ArrayList<>();
        ExcelModel excelModel1 = new ExcelModel();
        excelModel1.setId("100001");
        excelModel1.setUsername("贾");
        excelModel1.setEmail("295669145@qq.com");
        data.add(excelModel1);
        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doWrite(data);
    }

    @Test
    public void test002(){
        log.info("这是为什么呢？");
    }
}
