package week1;

import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sideA, sideB, sideC;

        sideA = sc.nextDouble();
        sideB = sc.nextDouble();
        sideC = sc.nextDouble();

        if (sideA > 0 && sideB > 0 && sideC > 0) {
            double abc[] = sortDecreasing(new double[]{sideA, sideB, sideC});
            sideA = abc[0];
            sideB = abc[1];
            sideC = abc[2];
            if (sideA >= (sideB + sideC)) {
                System.out.println("NAO FORMA TRIANGULO");
            }
            else if ((sideA * sideA) == ((sideB * sideB) + (sideC * sideC))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if ((sideA * sideA) > ((sideB * sideB) + (sideC * sideC))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if ((sideA * sideA) < ((sideB * sideB) + (sideC * sideC))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (sideA == sideB && sideB == sideC  && sideC==sideA) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if ((sideA == sideB && sideA != sideC) || (sideB == sideC && sideB != sideA) || (sideA == sideC && sideA != sideB)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }

    private static double[] sortDecreasing(double[] par) {

        for (int i = 0; i < par.length; i++) {
            for (int j = 0; j < par.length - 1; j++) {
                if (par[j] < par[j + 1]) {
                    double temp = par[j];
                    par[j] = par[j + 1];
                    par[j + 1] = temp;
                }

            }
        }
        return par;
    }
}
