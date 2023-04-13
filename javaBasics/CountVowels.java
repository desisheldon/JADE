package javaBasics;

public class CountVowels {

	public static void main(String[] args) {
		// aeiou
		String str="Anurag Ram Borde";
		char c;
		int count=0;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
				c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				count++;
			}
		}
		System.out.println("No. of vowels in the string are: "+count);

	}

}
