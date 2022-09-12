package week2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int testCasses = scn.nextInt();

        for (int i = 0; i < testCasses; i++) {
            int number = scn.nextInt();
            int sum = 0;

            for (int j = number - 1; j > 0; j--) {
                if (number % j == 0) {
                    sum += j;
                }
            }

            String answer = (number == sum) ? "eh perfeito" : "nao eh perfeito";

            System.out.printf("%d %s%n", number, answer);

        }
    }
}
