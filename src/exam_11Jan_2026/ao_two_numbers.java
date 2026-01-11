package exam_11Jan_2026;


import java.util.Scanner;

// Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
public class ao_two_numbers {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            // Sum
            System.out.println("Sum is : " + (num + num2));

            // Difference
            System.out.println("Difference is : " + (num - num2));

            // Multiplication
            System.out.println("Multiplication is : " + (num * num2));

            // Division
            System.out.println("Division is : " + (num / num2));

            // Remainder
            System.out.println("Remainder is : " + (num % num2));
        }else
            System.out.println("Invalid Input");


    }
}
