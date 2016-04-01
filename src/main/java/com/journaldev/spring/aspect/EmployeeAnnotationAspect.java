package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.journaldev.spring.aspect.Loggable)")
	public void myAdvice(JoinPoint joinpoint){
		System.out.println("Executing myAdvice with arg " + Arrays.toString(joinpoint.getArgs()) );
	}
}
