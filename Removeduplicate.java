package week1.day2;

public class Removeduplicate {

    public static void main(String[] args) {

        // Input String
        String text = "We learn Java basics as part of java sessions in java week1";

        // Split the string into words
        String[] words = text.split(" ");

        // Variable to count duplicates
        int count = 0;

        // Compare each word with every other word
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j])) {

                    // Replace duplicate word with empty string
                    words[j] = "";

                    // Increment count
                    count++;
                }
            }
        }

        // Print result if duplicates found
        if (count > 0) {

            for (int i = 0; i < words.length; i++) {

                if (!words[i].equals("")) {
                    System.out.print(words[i] + " ");
                }
            }
        }
    }
}
