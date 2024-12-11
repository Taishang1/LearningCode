package com.itbaizhan.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

// 定时任务类
@Component
public class MySpringTask3 {
    // 5秒才可以执行完任务1
    @Scheduled(cron = "* * * * * *")
    public void task1() throws InterruptedException {
        System.out.println(Thread.currentThread().getId()+"线程执行任务1");
        Thread.sleep(5000);
    }

    @Scheduled(cron = "* * * * * *")
    public void task2() {
        System.out.println(Thread.currentThread().getId()+"线程执行任务2");
    }
}
