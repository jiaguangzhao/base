package com.example.base.aop.datasource;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/16 22:43
 */
public final class DynamicDatasourceHolder {

    private final static ThreadLocal<String> LOCAL = new ThreadLocal<>();

    private DynamicDatasourceHolder(){

    }


    public static void putDataSourceName(String datasourceName) {
        LOCAL.set(datasourceName);
    }

    public static String getDatasourceName() {
        return LOCAL.get();
    }

    public static void removeDatasourceName() {
        LOCAL.remove();
    }
}
