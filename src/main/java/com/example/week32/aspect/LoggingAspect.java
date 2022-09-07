package com.example.week32.aspect;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.week32.controller.TestController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com..service..getDepartmentDto(..))")
    public void logBeforeGetDepartmentDto(JoinPoint joinPoint) {
        logger.info("Before " + joinPoint.toString());
    }

    @After("execution(* com..service..getDepartmentDto(..))")
    public void logAfterGetDepartmentDto(JoinPoint joinPoint) {
        logger.info("After " + joinPoint.toString());
    }

    @AfterThrowing(value = "execution(* com..service..getEmployeeDto(..))", throwing = "ex")
    public void logAfterThrowingGetEmployeeDto(JoinPoint joinPoint, Exception ex) {
        logger.error("Get {} at {}", ex.getMessage(), joinPoint.toString());
    }
}
