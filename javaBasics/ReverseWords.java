package javaBasics;

import java.util.*;

public class ReverseWords {

  public static void main(String[] args) {

    
    String input ="I am good at Java";

    String[] words = input.split(" ");
    String output = "";

    for (int i = 0; i < words.length; i++) {
      char[] word = words[i].toCharArray();
      for (int j = word.length - 1; j >= 0; j--) {
        output += word[j];
      }
      output += " ";
    }

    System.out.println("Reversed sentence: " + output);
  }
}
