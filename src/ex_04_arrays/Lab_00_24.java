package ex_04_arrays;

import java.util.Scanner;

public class Lab_00_24 {
    static void main() {
        // Right aligned pattern
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - i -1; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k <= i; k++) { System.out.print("*");}
                System.out.println();
            }
        }else{
            System.out.println("Enter an integer : )");
        }
    }
}
