package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	@SuppressWarnings("resource")
	@Test
	public void testAop() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		C c = context.getBean(C.class);
		c.doSomething();
	}
}
