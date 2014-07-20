package com.leo.han.aops;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CacheAspect {


	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private void pointcut1(){
		
	}
	
	@Pointcut("execution(public * com.leo.han.controllers.*.*(..))")
	private void pointcut2(){
		
	}


	@Before("pointcut1() && args(session, locale, ..)")
	public void beforeRequest(HttpSession session, Locale locale){
		
		
		
		
		System.out.println(locale.toString());
	}

}
