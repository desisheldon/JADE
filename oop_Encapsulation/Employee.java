package oop_Encapsulation;

public class Employee {

	public static void main(String[] args) {
	    Company c1=new Company();
	    c1.hq="Pune";
	    c1.name="Siemens";
	    c1.setSharePrice(1000);
	    int price=c1.getSharePrice();
	    System.out.println(price);
	    

	}

}
