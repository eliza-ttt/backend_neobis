package week2;

import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int tests = scn.nextInt();
        scn.nextLine();

        for (int i = 0; i < tests; i++) {
            String textOne = scn.next().trim();
            String textTwo = scn.nextLine().trim();

            String resultText = proccessStrings(textOne, textTwo);
            System.out.println(resultText);
        }
    }

    static String proccessStrings(String textOne, String textTwo) {
        StringBuilder processedString = new StringBuilder("");

        int shortestLength = Math.min(textOne.length(), textTwo.length());

        for (int i = 0; i < shortestLength; i++) {
            processedString.append(textOne.charAt(i));
            processedString.append(textTwo.charAt(i));

        }
        return processedString + (textOne.length() > textTwo.length() ? textOne.substring(shortestLength) : textTwo.substring(shortestLength));
    }
}
