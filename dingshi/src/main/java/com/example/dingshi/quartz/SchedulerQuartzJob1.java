package com.example.dingshi.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: lxy
 * @Date: 2019/1/15 13:42
 */
public class SchedulerQuartzJob1 implements Job {
    private void before(){
        System.out.println("任务开始执行1");
    }

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        before();
        System.out.println("开始1："+System.currentTimeMillis());
        // TODO 业务
        System.out.println("结束1："+System.currentTimeMillis());
        after();
    }

    private void after(){
        System.out.println("任务开始执行1");
    }

}

