package com.itbaizhan.task;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

// 定时任务类
@Component
public class MySpringTask {
    // 打印时间
    public void printTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String now = sdf.format(new Date());
        System.out.println(now);
    }
}
