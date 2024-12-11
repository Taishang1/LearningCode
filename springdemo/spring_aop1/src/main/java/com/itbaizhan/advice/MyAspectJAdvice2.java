package com.itbaizhan.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 通知类
public class MyAspectJAdvice2 {
    // 后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("发送邮件...");
    }
}
