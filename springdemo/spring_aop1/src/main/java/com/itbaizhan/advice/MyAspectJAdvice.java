package com.itbaizhan.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 通知类
public class MyAspectJAdvice {
    // 后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
//        System.out.println("切点方法名:"+joinPoint.getSignature().getName());
//        System.out.println("目标对象:"+joinPoint.getTarget());
        System.out.println("打印日志...");
//        System.out.println("后置通知...");

    }

    // 前置通知
    public void myBefore(){
        System.out.println("前置通知...");
    }

    // 异常通知
    public void myAfterThrowing(Exception ex){
        System.out.println("异常通知...");
        System.err.println(ex.getMessage());
    }

    // 最终通知
    public void myAfter(){
        System.out.println("最终通知...");
    }

    // 环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        // 执行切点方法
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕后");
        return proceed;
    }

}
