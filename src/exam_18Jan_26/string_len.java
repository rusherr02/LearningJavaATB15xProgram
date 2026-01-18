package exam_18Jan_26;

//Description:
//Write a Java program to count the total number of characters in a given string (excluding spaces).

import java.util.Scanner;

public class string_len {
    static void main() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(str.length() > 10) {
            System.out.println(str.length() + " is longer than 10");
        }
    }
}
