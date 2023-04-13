package javaBasics;

import java.util.Scanner;

public class ReverseWords2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you input String ?");
		String input=sc.nextLine();
		String[] words=input.split(" ");
        StringBuilder output=new StringBuilder();
        for (String word : words) {
			StringBuilder reversed=new StringBuilder(word);
						
			output.append(reversed.reverse()+" ");
			
		}
        System.out.println(output.toString().trim());
		
	}

}
