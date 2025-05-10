//package com.app.aspect.aspect.aspect;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspect.lang.JoinPoint;
//import org.aspect.lang.ProceedingJoinPoint;
//import org.aspect.lang.annotation.*;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//@Aspect
//@Configuration
//@Slf4j
//public class LogAspect {
//
//    @Before("@annotation(com.app.aspect.aspect.annotation.LogStatus)")
//    public void beforeStart(JoinPoint joinPoint) {
//        log.info("joinPoint : " + joinPoint);
//        log.info("method : " + joinPoint.getSignature().getName());
////        log.info("args : " + joinPoint.getArgs());
//        log.info("args : " + Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(",")));
//    };
//
//    @After("@annotation(com.app.aspect.aspect.annotation.LogStatus)")
//    public void AfterStart(JoinPoint joinPoint) {
//        log.info("joinPoint : " + joinPoint);
//        log.info("method : " + joinPoint.getSignature().getName());
////        log.info("args : " + joinPoint.getArgs());
//        log.info("args : " + Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(",")));
//    };
//
//    @AfterReturning(value = "@annotation(com.app.aspect.aspect.annotation.LogStatus)", returning = "returnValue")
//    public void AfterReturning(JoinPoint joinPoint, Integer returnValue) {
//        log.info("afterReturning");
//        log.info("return value : " + returnValue);
//    }
//
//    @AfterThrowing(value = "@annotation(com.app.aspect.aspect.annotation.LogStatus)", throwing = "e")
//    public void AfterReturning(JoinPoint joinPoint, Exception e) {
//        log.info(e.getMessage());
//        e.printStackTrace();
//    }
//
//    //    재정의
////    proceedingJoinPoint.proceed()
//    @Around("@annotation(com.app.aspect.aspect.annotation.LogStatus)")
//    public Integer Around(ProceedingJoinPoint proceedingJoinPoint) {
//        log.info("point cut : " + proceedingJoinPoint);
//        Integer result = 0;
//
//        try {
//            result = (Integer)proceedingJoinPoint.proceed();
//        } catch (NumberFormatException e) {
//            log.info("잘못된 매개변수 값");
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        } finally {
//            log.info("close 문");
//        }
//
////        결과를 바꾸고 싶다면
//        result += 10;
//
//        return result;
//    };
//}
