package cn.spring.basic.intercept.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonAOP {


    private static final Logger logger = LoggerFactory.getLogger(CommonAOP.class);

    /**
     * 指定切点
     * 匹配 controller包以及其子包下所有类的所有方法
     */
    @Pointcut("execution(public * cn.spring.basic.controller..*(..))")
    public void optlog() {

    }

    @Before("optlog()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("CommonAOP.doBefore.start....");
    }
}
