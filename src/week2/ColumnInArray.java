package week2;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double[][] arr = new double[12][12];
        int col = scn.nextInt();
        String text = scn.next();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextDouble();
            }
        }

        switch (text) {
            case "S":
                double sum = 0;

                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][col];
                }
                System.out.printf("%.1f%n", sum);
                break;
            case "M":
                double average = 0;

                for (int i = 0; i < arr.length; i++) {
                    average += arr[i][col];
                }
                average /= arr[0].length;
                System.out.printf("%.1f%n", average);
                break;
        }
    }
}
