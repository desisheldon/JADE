package javaBasics;

import java.util.HashMap;

public class LetterCount {

	public static void main(String[] args) {
		String str="Jade Global";
		HashMap<Character,Integer> getCount=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(getCount.containsKey(c)) {
				getCount.put(c, getCount.get(c)+1);
			}
			else {
				getCount.put(c, 1);
			}
		}
		//Print results
		for (Character c : getCount.keySet()) {
			System.out.println("Letter count for character "+c+"  is "+getCount.get(c));
		}

	}

}
