package javaBasics;

public class Palindrome2 {
	public static void main(String[] args) {
		String input = "abc";
		int length = input.length();
		int i, start, middle, end;
		start = 0;
		end = length - 1;
		end = length - 1;
		middle = (start + end) / 2;  //remember
		for (i = start; i <= middle; i++) {
			if (input.charAt(i) == input.charAt(end)) {
				start++;
				end--;
			} else {
				break;
			}
		}
		if (i == middle + 1) {
			System.out.println("Given string is Palendrome");
		} else
			System.out.println("Not a Palendrome");
	}

}