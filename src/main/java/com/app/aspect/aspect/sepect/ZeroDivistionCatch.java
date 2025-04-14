package com.app.aspect.aspect.sepect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class ZeroDivistionCatch {

    @Around("@annotation(com.app.aspect.aspect.annotation.ZeroDivision)")
    public int ZeroDivision(ProceedingJoinPoint proceedingJoinPoint) {
        log.info("{}", proceedingJoinPoint);
        int result = 0;

        try {
            result = (Integer) proceedingJoinPoint.proceed();
        } catch (ArithmeticException e){
            log.info("0으로 나눌 수 없습니다.");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    };

}
