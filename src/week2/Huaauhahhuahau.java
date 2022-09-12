package week2;

import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String laugh = scn.next();
        String lol = "";

        for(int i = 0 ; i < laugh.length() ; i++)
            if (laugh.charAt(i) == 'a' || laugh.charAt(i) == 'e' || laugh.charAt(i) == 'i' || laugh.charAt(i) == 'o' || laugh.charAt(i) == 'u')
                lol = lol + laugh.charAt(i);

        String relol = new StringBuilder(lol).reverse().toString();

        if (lol.equals(relol))
            System.out.println("S");
        else
            System.out.println("N");
    }
}
