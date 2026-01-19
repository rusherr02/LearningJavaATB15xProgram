package ex_04_arrays;

import java.util.Scanner;

public class Lab_00_23_star {
    static void main() {
        // Right angle pattern
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Enter an integer : )");
        }
    }
}
