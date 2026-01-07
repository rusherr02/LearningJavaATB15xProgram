package ex_02_Java_Basics;

import java.util.Scanner;

public class Lab0016_Factorial {
    static void main(String[] args) {
        // Factorial
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);


    }
}
