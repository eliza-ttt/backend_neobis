package week1;

import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int test = scn.nextInt();

        for (int i = 0; i < test; i++) {
            double numOne = scn.nextDouble();
            double numTwo = scn.nextDouble();
            double numThree = scn.nextDouble();

            double totalSum = weightedAverages(numOne, numTwo, numThree);

            System.out.printf("%.1f%n", totalSum);
        }
    }

    private static double weightedAverages(double a, double b, double c) {
        double sum = 0;

        int weightOne = 2, weightTwo = 3, weightThree = 5;
        sum = (((a * weightOne) + (b * weightTwo) + (c * weightThree)) / (weightOne + weightTwo + weightThree));

        return sum;
    }
}
