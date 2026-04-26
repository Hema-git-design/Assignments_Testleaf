package  week1.day2;

import java.util.Scanner;

public class Fibbonace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= range; i++) {

            System.out.print(firstNumber);

            if (i < range) {
                System.out.print(", ");
            }

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        sc.close();
    }
}
    