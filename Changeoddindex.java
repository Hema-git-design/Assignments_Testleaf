package week1.day2;

public class Changeoddindex {

    public static void main(String[] args) {

        // Input String
        String test = "changeme";

        // Convert String to character array
        char[] charArray = test.toCharArray();

        // Loop from end to start
        for (int i = charArray.length - 1; i >= 0; i--) {

            // Check odd index
            if (i % 2 != 0) {

                // Convert odd index character to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
         // Convert character array back to String
        String result = new String(charArray);

        // Print output
        System.out.println(result);
    }
}
