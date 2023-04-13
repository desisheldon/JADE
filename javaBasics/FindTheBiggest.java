package javaBasics;

public class FindTheBiggest {

	public static void main(String[] args) {
		int[] numb= {25, 11, 7, 55,98,10};

		int big=0;//Integer.MIN_VALUE
		
		for(int number:numb) {
			if(number>big) {
				big=number;
			}
		 
		}

		System.out.print("Biggest number is "+big);
	}

}
//div[text()='Cricket, Football & More']//following-sibling::div[@class='_2tDhp2' and text()='Up to 70% Off']
