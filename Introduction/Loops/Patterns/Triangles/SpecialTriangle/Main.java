package Introduction.Loops.Patterns.Triangles.SpecialTriangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of triangle: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == j && j != 0) {
                    System.out.print("* ");
                } else if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        sc.close();
    }
}