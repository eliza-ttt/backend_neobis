package week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FlaviousJosephus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();
        for (int k = 1; k < testcase+1; k++) {
            int howManyPeoples = scn.nextInt();
            int step = scn.nextInt();
            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 1; i <= howManyPeoples; i++)
                queue.add(i);
            int counter = 0;
            while (!queue.isEmpty()) {
                for (int i = 0; i < step - 1; i++)
                    queue.add(queue.remove());
                counter = queue.remove();
            }
            System.out.println("Case "+k+": "+counter);
        }
    }
}
