package javaBasics;

public class Palindrome {
    public static void main(String[] args) {
        String word = "racecar";
        int length = word.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (word.charAt(begin) == word.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("The word is a palindrome.");
        }
        else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
