package javaBasics;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {
        // Removing spaces and converting strings to lowercases
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Checking length of strings
        if (s1.length() != s2.length()) {
            return false;
        }

        // Sorting characters of both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Comparing sorted arrays
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}

