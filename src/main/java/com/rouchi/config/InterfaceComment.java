package com.rouchi.config;

public class InterfaceComment {


    /**
     * 统一入口
     */
    public static final String API = "/api";

    /**
     * Azkaban功能入口
     *
     */
    public static final String AZ_ENTRANCE = "/azkaban";

    //获取失败job
    public static final String GET_FAIL_JOB = AZ_ENTRANCE+"/getFailJob";

    //重跑失败任务
    //	swagger-ui.html#/api/portraidp/uidbylable
    public static final String RERUN_FAIL_JOB = AZ_ENTRANCE+"/reRunFaidJob";


}

