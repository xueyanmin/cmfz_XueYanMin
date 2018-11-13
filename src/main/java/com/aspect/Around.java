package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect

public class Around {

    @Pointcut("@annotation(Log)")
    public void pointCut(){}


   /* @After(value = "pointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(args);

        Object target = joinPoint.getTarget();
        System.out.println(target);

        Object aThis = joinPoint.getThis();
        System.out.println(aThis);

        Signature signature = joinPoint.getSignature();
        System.out.println(signature);
        System.out.println("this is before advice invoke");
    }*/
   @org.aspectj.lang.annotation.Around(value = "pointCut()")
   public Object beforeAdvice(ProceedingJoinPoint proceedingJoinPoint){
      Object proceed=null;

       try {
           System.out.println("目标类前执行？？？");
           proceed=proceedingJoinPoint.proceed();
           System.out.println("method id finish");
       } catch (Throwable throwable) {
           throwable.printStackTrace();
       }

       return proceed;
   }


}
