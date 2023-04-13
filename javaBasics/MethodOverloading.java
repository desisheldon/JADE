package javaBasics;

public class MethodOverloading {
	
	public void login() { //1
		System.out.println("default login");
	}
    
	public void login(String username,String pwd) {
		System.out.println("login with : "+username+ " & "+pwd);
	}
	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		m1.login();
		m1.login("Anurag", "Anurag@123");

	}

}
