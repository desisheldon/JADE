package exceptionHandling;

public class ThrowsKeyword {
	public void m1() {
		System.out.println("In method m1");
		m2();
	}
	public void m2() {
		System.out.println("In method m2");
		m3();
	}
	public void m3() {
		System.out.println("In method m3");
		int i=3/0;
	}

	public static void main(String[] args) {
		

	}

}
