package com.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@After("execution(* com.revature.service.*.get*(..))")
	public void highjackPlays(JoinPoint jp) {
		
	}
}
