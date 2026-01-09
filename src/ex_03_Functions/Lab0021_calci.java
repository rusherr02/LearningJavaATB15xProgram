package ex_03_Functions;

import java.util.Scanner;

public class Lab0021_calci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = readInt(sc, "Enter a number: ");
        int num2 = readInt(sc, "Enter a number: ");


        System.out.println("Sum "+ sum(num, num2));
        System.out.println("Subtraction " + sub(num, num2));
        System.out.println("Mul " + mul(num, num2));
        System.out.println("Div " + div(num, num2));
        System.out.println("Mod " + mod(num, num2));


        sc.close();
    }

    static int readInt(Scanner sc, String prompt){
        System.out.print(prompt);
        if(sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.out.println("Enter integer only : )");
            System.exit(0);
            return 0;
        }
    }


    static int sum(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static int div(int a, int b){
        return a / b;
    }
    static int mod(int a, int b){
        return a % b;
    }
}
