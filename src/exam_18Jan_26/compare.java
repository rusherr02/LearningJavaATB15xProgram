package exam_18Jan_26;

//Description:
//Write a Java program to compare two strings and check whether they are equal or not.

import java.util.Scanner;

public class compare {
    static void main() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str1 = input.nextLine();
        if(str.equals(str1))
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");
    }
}
