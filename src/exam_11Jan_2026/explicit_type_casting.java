package exam_11Jan_2026;


import java.util.Scanner;

// Write a Java program to convert a double value into an int using explicit type casting and print both values.
public class explicit_type_casting {


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(sc.hasNextDouble()) {
            double num = sc.nextDouble();
            System.out.println("Explicit type casting into int: "+
                    (int)num + " of " + num
            );
        }else
            System.out.println("Enter a valid double number");
    }
}
