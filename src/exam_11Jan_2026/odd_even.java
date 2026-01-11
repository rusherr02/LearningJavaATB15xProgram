package exam_11Jan_2026;


import java.util.Scanner;

//Write a Java program to check whether a given number is even or odd using arithmetic operators.
public class odd_even {


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                System.out.println("The number is even");
            else
                System.out.println("The number is odd");
        }else
            System.out.println("Enter valid input");
    }
}
