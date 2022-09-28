package tech.pdai.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class ServiceLogAspect {


    @Around("execution(* tech.pdai.spring.service.*.*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Signature signature = proceedingJoinPoint.getSignature();
        if (signature instanceof MethodSignature){
            Method method = ((MethodSignature) signature).getMethod();
            System.out.println("execute methon "+ method.getName());
        }
        return proceedingJoinPoint.proceed();
    }
}
