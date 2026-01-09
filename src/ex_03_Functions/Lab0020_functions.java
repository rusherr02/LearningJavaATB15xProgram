package ex_03_Functions;

import java.util.Scanner;

public class Lab0020_functions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        name_of_function();
        System.out.println(sum());
        sum(10002,9);
        System.out.println(sum2(num, 923));
    }

    private static void name_of_function() {
        System.out.println("Hello World!");
    }

    static int sum(){
        System.out.println("Return");
        return 10+2932;
    }

    static void sum(int a, int b){
        System.out.println("Sum "+ (a + b));
    }

    static int sum2(int a, int b){
        return a + b;
    }
}
