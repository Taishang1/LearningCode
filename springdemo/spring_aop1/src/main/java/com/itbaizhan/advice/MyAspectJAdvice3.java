//package com.itbaizhan.advice;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//// 通知类
//@Aspect
//@Component
//public class MyAspectJAdvice3 {
//    // 该方法的作用是统一配置切点
//    @Pointcut("execution(* com.itbaizhan.dao.UserDao.*(..))")
//    public void pointCut(){}
//
//    // 后置通知
//    @AfterReturning("pointCut()")
//    public void myAfterReturning(JoinPoint joinPoint) {
//        System.out.println("后置通知...");
//    }
//
//    // 前置通知
//    @Before("pointCut()")
//    public void myBefore(){
//        System.out.println("前置通知...");
//    }
//
//    // 异常通知
//    @AfterThrowing(value = "pointCut()",throwing = "ex")
//    public void myAfterThrowing(Exception ex){
//        System.out.println("异常通知...");
//        System.err.println(ex.getMessage());
//    }
//
//    // 最终通知
//    @After("pointCut()")
//    public void myAfter(){
//        System.out.println("最终通知...");
//    }
//
//    // 环绕通知
//    @Around("pointCut()")
//    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕前");
//        // 执行切点方法
//        Object proceed = proceedingJoinPoint.proceed();
//        System.out.println("环绕后");
//        return proceed;
//    }
//
//}
