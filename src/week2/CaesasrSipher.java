package week2;

import java.util.Scanner;

public class CaesasrSipher {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int test = scn.nextInt();

        scn.nextLine();

        for (int i = 0; i < test; i++) {
            String text = scn.nextLine();
            int shift = scn.nextInt();

            scn.nextLine();

            char[] letters = text.toCharArray();
            for (int j = 0; j < letters.length; j++) {
                letters[j] = (char) (letters[j] - shift);

                if(letters[j] < 'A') {
                    letters[j] += 26;
                }
            }
            System.out.println(String.copyValueOf(letters));
        }
    }
}
