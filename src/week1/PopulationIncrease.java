package week1;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        int populationOfCityFirst, populationOfCitySecond, anos;
        double percentOfCityFirst, percentOfCitySecond;
        for (int i = 1; i <= test; i++) {
            anos = 0;
            populationOfCityFirst = scn.nextInt();
            populationOfCitySecond = scn.nextInt();
            percentOfCityFirst = scn.nextDouble();
            percentOfCitySecond = scn.nextDouble();
            while (populationOfCitySecond >= populationOfCityFirst) {
                populationOfCityFirst += (populationOfCityFirst * percentOfCityFirst) / 100;
                populationOfCitySecond += (populationOfCitySecond * percentOfCitySecond) / 100;
                anos++;
                if (anos > 100) {
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos");
            }
        }
    }
}
