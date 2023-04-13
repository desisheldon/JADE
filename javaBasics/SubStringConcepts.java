package javaBasics;

public class SubStringConcepts {

	public static void main(String[] args) {
//		String str="Vande Bharat";
//	    int l1=str.length();
//	    System.out.println(l1);
//	    System.out.println(str.substring(6));  //Type 1
//	    //System.out.println(str1.substring(7));
//	    System.out.println(str.substring(0,5));
//	    System.out.println(str.substring(6,12));
	    
		String str1="Vande";
		String str2="Bharat";
		str1=str1+str2; //VandeBharat
		str2=str1.substring(0, str1.length()-str2.length()); //11-6
		System.out.println("Now String 2 is "+str2);
		str1=str1.substring(str2.length(), str1.length());
		System.out.println("Now String 1 is : "+str1);
	    
	    

	}

}
