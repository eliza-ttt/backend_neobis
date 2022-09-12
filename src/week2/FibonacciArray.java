package week2;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n, f;
        long fib[] = new long[61];
        n = scn.nextInt();

        fib[0] = 0;
        fib[1] = 1;
        for(int j = 2; j <= 60; j++){
            fib[j] = fib[j-2] + fib[j-1];
        }

        for(int i = 0; i < n; i++){
            f = scn.nextInt();
            System.out.printf("Fib(%d) = %d%n", f, fib[f]);
        }
    }
}
