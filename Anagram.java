package week1.day2;

import java.util.Arrays;

public class Anagram {

      public static void main(String[] args) {

        // Input strings
        String text1 = "stops";
        String text2 = "potss";

        // Check length
        if (text1.length() == text2.length()) {

            // Convert strings to character arrays
            char[] charArray1 = text1.toCharArray();
            char[] charArray2 = text2.toCharArray();

            // Sort the arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            // Compare sorted arrays
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The given strings are Anagram.");
            } else {
                System.out.println("The given strings are not an Anagram.");
            }

        } else {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
        }
    }
}

