package javaBasics;

public class StringSwap {
	  public static void main(String[] args) {
	    String str1 = "Hello";
	    String str2 = "World";

	    
		/*
		 * str1 = str1+ str2; System.out.println(str1.substring(0)); str1
		 * =str1.substring(5); System.out.println(str1);
		 * 
		 */
		  
		  System.out.println("Before swapping:"); 
		  System.out.println("str1 = " + str1);
		  System.out.println("str2 = " + str2);
		  
		  // Swapping without using third variable 
		  str1 = str1 + str2; //Hello World
		  System.out.println(str1);     
		  System.out.println("Length of String str1 : "+str1.length());
		  //str2=11-5
		  str2 = str1.substring(0, str1.length() - str2.length());
		  System.out.println("Length of String str2 : "+str2.length());
		  System.out.println(str2); //Hello 
		  str1 = str1.substring(str2.length());  //World
		  
		  System.out.println("After swapping:"); System.out.println("str1 = " + str1);
		  System.out.println("str2 = " + str2);
		 
	  }
	}

