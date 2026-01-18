package exam_18Jan_26;

//Description:
//Write a Java program to count the total number of characters in a given string (excluding spaces).

import java.util.Scanner;

public class count_chars {
    static void main() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
