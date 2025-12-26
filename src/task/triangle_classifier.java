package task;

import java.util.Scanner;

public class triangle_classifier {

//    Write a program that classifies a triangle based on its side lengths.
//    Given three input values representing the lengths of the sides, determine if the triangle
//    is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
//    Use an if-else statement to classify the triangle.

static void main() {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a == b && a == c) {
        System.out.println("It's a equivalent triangle");
    }else if (a == b || b == c) {
        System.out.println("It's a isosceles triangle");
    }else{
        System.out.println("It's a scalene triangle");
    }


}


}
