package week1.day2;

public class Prime {
    public static void main(String[] args) {

        int input = 13;

        boolean isPrime = true;

        for (int i = 2; i < input; i++) {

            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Print the result
        if (isPrime && input > 1) {
            System.out.println(input + " is a Prime Number");
        } else {
            System.out.println(input + " is not a Prime Number");
        }
    }
}
    