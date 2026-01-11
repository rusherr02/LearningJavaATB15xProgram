package exam_11Jan_2026;


import java.util.Scanner;

//Description:
//Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.


public class bbreak {


    static void main() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            if(i == 5)
                break;
            i++;
        }
    }
}
