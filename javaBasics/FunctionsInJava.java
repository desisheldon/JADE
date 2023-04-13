package javaBasics;

public class FunctionsInJava {
	public void noReturn() {
		System.out.println("This function() does not take in arguments nor returns ");
		System.out.println("---------------------");
	}
	public int add(int a, int b) { //method parameter
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		FunctionsInJava f1=new FunctionsInJava();
		f1.noReturn();
		int sum1=f1.add(10, 20); //Method Arguments
		System.out.println("Addition of given two nos : "+sum1);
		System.out.println("----------------------");

	}

}
