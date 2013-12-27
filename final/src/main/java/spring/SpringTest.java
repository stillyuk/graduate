package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
	public A mockA() {
		A a = new A();
		a.setName("a");
		return a;
	}
	
	@SuppressWarnings("resource")
	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);
		A a = context.getBean(A.class);
		a.doSomething();
	}
}
