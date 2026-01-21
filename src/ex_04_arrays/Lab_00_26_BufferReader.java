package ex_04_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab_00_26_BufferReader {
    static void main(String[] args) {

//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       int n = Integer.parseInt(ms);
//        	•	Total rows = n
//	•	Row i has:
//	•	(n - i) leading spaces
//	•	i stars
//	•	Stars are separated by a space (* )
//
//⸻
//
//  Logic Breakdown
//
//        For each row i from 1 to n:
//        1.	Print (n - i) spaces
//        2.	Print i stars
//        3.	Move to next line
//
//        This spacing is what makes it a pyramid.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++){
            for(int space = 1; space <= n-row; space++)
                System.out.print(" ");
            for(int star = 1; star <= row; star++)
                System.out.print("* ");

            System.out.println();
        }



    }
}
