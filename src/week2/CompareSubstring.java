package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CompareSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String textOne, textTwo, max, min;
        while ((textOne = in.readLine()) != null) {
            textTwo = in.readLine();
            if (textOne.length() >= textTwo.length()) {
                max = textOne;
                min = textTwo;
            } else {
                max = textTwo;
                min = textOne;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
}
