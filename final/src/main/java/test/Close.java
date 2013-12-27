package test;

class Test {
	static {
		System.out.println("outer class static block");
	}

	static class A {
		static {
			System.out.println("inner class static block");
		}
	}

	public static void main(String[] args) {
		new Test.A();
	}
}
