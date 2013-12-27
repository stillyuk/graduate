package spring;

public class A implements C {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doSomething() {
		System.out.println("doSomething...");
	}
}

interface C {
	void doSomething();
}