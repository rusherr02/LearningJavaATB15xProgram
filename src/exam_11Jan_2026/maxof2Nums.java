package exam_11Jan_2026;


import java.util.Scanner;

// Description:
//Write a Java program to find the maximum of two numbers using the ternary operator.

public class maxof2Nums {


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        if(sc.hasNextInt()) {
           int a = sc.nextInt();
           int b = sc.nextInt();

            int max = (a > b )? a : b;
           System.out.println("Maximum is : "+ max);

        }else
            System.out.println("Enter a valid input");
    }
}
