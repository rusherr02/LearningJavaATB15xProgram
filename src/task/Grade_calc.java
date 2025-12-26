package task;

import java.util.Scanner;

public class Grade_calc {
    static void main() {
//        Write a program that calculates and displays the letter grade for a given
//        numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//        A: 90-100
//
//        B: 80-89
//
//        C: 70-79
//
//        D: 60-69
//
//        F: 0-59
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        }else if(score >= 80 && score <= 89) {
            System.out.println("B");
        }else if(score >= 70 && score <= 79) {
            System.out.println("C");
        }else if(score >= 60 && score <= 69) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
