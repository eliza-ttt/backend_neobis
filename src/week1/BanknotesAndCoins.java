package week1;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double money = scan.nextDouble(); // 576.73.
        int banknotes = (int) money; // 576
        int coins = (int) ((money - banknotes) * 100);

        System.out.println("NOTAS:");

        System.out.printf("%d nota(s) de R$ 100.00%n", banknotes/100);
        banknotes %= 100;

        System.out.printf("%d nota(s) de R$ 50.00%n",banknotes/50);
        banknotes %= 50;

        System.out.printf("%d nota(s) de R$ 20.00%n", banknotes/20);
        banknotes %= 20;

        System.out.printf("%d nota(s) de R$ 10.00%n", banknotes/10);
        banknotes %= 10;

        System.out.printf("%d nota(s) de R$ 5.00%n", banknotes/5);
        banknotes %= 5;

        System.out.printf("%d nota(s) de R$ 2.00%n",banknotes/2);
        banknotes %= 2;


        System.out.println("MOEDAS:");

        System.out.printf("%d moeda(s) de R$ 1.00%n", banknotes);

        System.out.printf(coins/50 + " moeda(s) de R$ 0.50%n");
        coins %= 50;

        System.out.printf(coins/25 + " moeda(s) de R$ 0.25%n");
        coins %= 25;

        System.out.printf(coins/10 + " moeda(s) de R$ 0.10%n");
        coins %= 10;

        System.out.printf(coins/5 + " moeda(s) de R$ 0.05%n");
        coins %= 5;

        System.out.printf(coins/1 + " moeda(s) de R$ 0.01%n");


    }
}
