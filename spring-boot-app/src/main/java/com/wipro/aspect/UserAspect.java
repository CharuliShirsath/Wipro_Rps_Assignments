package com.wipro.aspect;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component

public class UserAspect {
	@Pointcut("execution(* com.wipro.service.UserService.*(..))")
	private void pointCut1() {
		
	}

	
//	@Before("execution ( public com.wipro.service.UserService.get*(..))")
//	@Before("pointCut1()")
//	public void beforeAdvice(JoinPoint joinPoint) {
//		System.out.println("JointPoint method is: ");
//		System.out.println(joinPoint.getSignature().getName());
//		log.info(joinPoint.getSignature().getName());
//	}
	
//	@After("pointCut1()")
//	public void afterAdvice(JoinPoint joinPoint) {
//		System.out.println("After JointPoint method is: ");
//		System.out.println(joinPoint.getSignature().getName());
//		log.info("After JointPoint method:"+joinPoint.getSignature().getName());
//	}


	@Around("pointCut1()")
   public Object measureMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
       long start = System.nanoTime();
       //explicitly executing jointPoint method
       Object retval = pjp.proceed();
       long end = System.nanoTime();
       String methodName = pjp.getSignature().getName();
       log.info("Execution of " + methodName + " took " +
         TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
       return retval;
   }

}

