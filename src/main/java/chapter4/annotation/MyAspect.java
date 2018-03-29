package chapter4.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* chapter4.annotation.UserService.add(..)) && @annotation(log)")
    public void pointAdd(LogAnnotation log) {
        // System.out.println("register pointAdd");
    }

    @Pointcut("execution(* chapter4.annotation.UserService.delete(..))")
    public void pointDelete() {
        // System.out.println("register pointDelete");
    }

    @Pointcut(value = "execution(* chapter4.annotation.UserService.update(..)) && args(message)")
    public void pointMessage(String message) {
        // System.out.println("register pointMessage");
    }

    @After(value = "pointMessage(message)")
    public void updateAfter(String message) {
        System.out.println("after" + message);
    }

    @Before(value = "pointDelete()")
    public void beforeMethod() {
        System.out.println("before");
    }

    @Around(value = "pointAdd(log)", argNames = "pjd,log")
    public void aroundMethod(ProceedingJoinPoint pjd, LogAnnotation log) {
        System.out.println(log.desc());
        try {
            System.out.println("前置通知");
            pjd.proceed();
            System.out.println("后置通知");
        } catch (Throwable e) {
            System.out.println("异常通知");
        }
        System.out.println("返回通知");
    }
}
