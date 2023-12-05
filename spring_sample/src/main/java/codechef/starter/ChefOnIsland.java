package codechef.starter;/*
    Created By: Talveen Rakhra
    Created On: 03-05-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChefOnIsland {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int xr = scanner.nextInt();
            int yr = scanner.nextInt();
            int D = scanner.nextInt();
            if (xr * D < x && yr * D < y) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

}
