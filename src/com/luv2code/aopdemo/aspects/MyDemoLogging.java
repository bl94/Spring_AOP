package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogging {
	
	//Poincut declartions to multiple advice(s)
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDAOpackage() {}
			
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {}
				
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDAOpackage() && !(getter() || setter())")
	public void forDAOPackageNoGetterSetter() {}
	
	/*
	 * @Before("forDAOPackageNoGetterSetter()") public void noGetterSetter() {
	 * System.out.
	 * println("\n >>>>>>Executing @Before advice on method EXCEPT Getter and Setter"
	 * ); }
	 */
	@Before("forDAOPackageNoGetterSetter()")
	public void beforeAddMethodAdvice() {
		System.out.println("\n >>>>>>Executing @Before advice on method");
	}
	
	@Before("forDAOPackageNoGetterSetter()")
	public void performAPIanalytics() {
		System.out.println("\n >>>>>>Perform API Analytics");
	}
	
}
