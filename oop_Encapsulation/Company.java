package oop_Encapsulation;

public class Company {
	public String name;
	private int sharePrice;
	public String hq;
	
	//getter method to access private variable
	
	public int getSharePrice() {
		//System.out.println("Share Price from getter method is :"+sharePrice);
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice=sharePrice;  //
        System.out.println("Share Price set by setter method");
	}  
	

	public static void main(String[] args) {
		
		Company obj1=new Company();
		obj1.sharePrice=10;  // Private vars can be accessed from same class
		obj1.name="Redhat";
		obj1.hq="Pune";
		

	}

}
