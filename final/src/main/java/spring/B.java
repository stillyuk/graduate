package spring;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
class B {
	@Pointcut("within(spring..*)")
	public void myPointcut() {}
	
	@Around("myPointcut()")
	public void myLogger() {
		System.out.println("logger");
	}
}