package exam_11Jan_2026;


import java.util.Scanner;

//Description:
//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.



public class number5 {


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        if(sc.hasNextInt()) {
           int num = sc.nextInt();

            System.out.println((num < 0) ? "Number is negative" :
                    (num == 0) ? "Number is zero" :
                            "Number is positive");


        }else
            System.out.println("Enter a valid input");
    }
}
