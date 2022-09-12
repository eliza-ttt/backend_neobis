package week2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int testCasses = scn.nextInt();

        for (int i = 0; i < testCasses; i++) {

            int number = scn.nextInt();

            boolean prime = isPrime(number);

            System.out.println(number + (prime ? " nao eh primo" : " eh primo"));
        }
    }

    public static boolean isPrime(int number) {
        int divisor = 0;

        for (int j = number; j > 0; j--) {
            if (number % j == 0) {
                divisor++;
            }
            if (divisor > 2) {
                break;
            }
        }
        return divisor > 2;
    }
}
