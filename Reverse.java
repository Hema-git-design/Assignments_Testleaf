package week1.day2;

public class Reverse {

    public static void main(String[] args) {

        // Input String
        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check for odd index
            if (i % 2 != 0) {

                // Convert word to character array
                char[] charArray = words[i].toCharArray();

                // Print characters in reverse order
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }

            } else {

                // Print word as it is
                System.out.print(words[i]);
            }

            // Add space after each word
            System.out.print(" ");
        }
    }
}

