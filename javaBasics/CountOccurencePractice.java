package javaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurencePractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		HashMap<Character,Integer> getCount=new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if(getCount.containsKey(c)) {
				getCount.put(c, getCount.get(c)+1);	
			}
			else {
				getCount.put(c, 1);
			}
			
			}
		for(Character c:getCount.keySet()) {
			System.out.println("Character "+c+" has occurred : "+getCount.get(c));	
		}
	

	}

}
