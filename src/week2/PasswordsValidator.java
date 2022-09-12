package week2;

import java.util.Scanner;

public class PasswordsValidator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (scn.hasNext()) {
            String password = scn.nextLine();
            int counterUpperCase = 0;
            int counterLowerCase = 0;
            int counterNumber = 0;

            if (password.length() >= 6 && password.length() <= 32) {
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') counterLowerCase++;
                    else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') counterUpperCase++;
                    else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') counterNumber++;
                }
                if (counterUpperCase == 0) System.out.println("Senha invalida.");
                else if (counterLowerCase == 0) System.out.println("Senha invalida.");
                else if (counterNumber == 0) System.out.println("Senha invalida.");
                else if (counterUpperCase + counterLowerCase + counterNumber == password.length()) System.out.println("Senha valida.");
                else System.out.println("Senha invalida.");
            }
            else System.out.println("Senha invalida.");
        }
    }
}
