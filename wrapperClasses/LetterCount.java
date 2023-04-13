package wrapperClasses;

import java.util.HashMap;

public class LetterCount {

	public static void main(String[] args) {
		String str="Sai Vaastu";
		int len=str.length();
		HashMap<Character,Integer> count=new HashMap<>();
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			if(count.containsKey(c)) {
				count.put(c,count.get(c)+1);
			}else {
				count.put(c, 1);
			}			
		}
		for(Character c:count.keySet()) {
			System.out.println(c+" : "+count.get(c));
		}	
	}

}
