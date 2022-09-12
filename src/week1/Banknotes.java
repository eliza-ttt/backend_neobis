package week1;

import java.util.Scanner;

public class Banknotes {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int money = scn.nextInt();

            System.out.println(money);

            System.out.printf("%d nota(s) de R$ 100,00%n", money / 100);
            money %= 100;

            System.out.printf("%d nota(s) de R$ 50,00%n", money / 50);
            money %= 50;

            System.out.printf("%d nota(s) de R$ 20,00%n", money / 20);
            money %= 20;

            System.out.printf("%d nota(s) de R$ 10,00%n", money / 10);
            money %= 10;

            System.out.printf("%d nota(s) de R$ 5,00%n", money / 5);
            money %= 5;

            System.out.printf("%d nota(s) de R$ 2,00%n", money / 2);
            money %= 2;

            System.out.printf("%d nota(s) de R$ 1,00%n", money / 1);
            money %= 1;
        }
}
