package seleniumpractice1;

import java.util.Arrays;

public class AnagramPractice {

	public static void main(String[] args) {
		String str1="Listen";
		String str2="Silent";
		String s1=str1.replace("\\s","").toLowerCase();
		String s2=str2.replace("\\s","").toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("Strings are not anagram");
		}
		else {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Strings are anagrams");
			}
			else {
				System.out.println("Strings are not anagram");
			}
				
		}
		
		

	}

}
