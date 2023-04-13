package javaBasics;

public class ReverseString {

	public static void main(String[] args) {
		String str="This is my Cat";
		String rev="";
		int len=str.length();
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			rev=c+rev;
			
			
		}
		System.out.println(rev);
		

	}

}
