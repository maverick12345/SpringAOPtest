package org.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(public String org.shapes.Triangle.getName())")
	public void aspectAdvice() {
		System.out.println("aspect running.....");
		System.out.println("aspect method is  running");
		System.out.println("aspect method is  running............");
	}
}
