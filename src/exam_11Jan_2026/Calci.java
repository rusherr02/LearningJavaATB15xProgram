package exam_11Jan_2026;


import java.util.Scanner;

//Description:
//Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.

public class Calci {


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation would you like to perform?: ");
        String operation = sc.nextLine();
        System.out.println("Enter two numbers : ");

        if(sc.hasNextInt()) {
           int n1 = sc.nextInt();
           int n2 = sc.nextInt();

           switch (operation) {
               case "Add":
                   System.out.println(n1+n2);
                   break;
               case "Subtract":
                   System.out.println(n2-n1);
                   break;
                   case "Multiply":
                   System.out.println(n1 * n2);
                   break;
                   case "Divide":
                       System.out.println(n1 / n2);
                       break;
               default:
                       System.out.println(n1 % n2);
           }

        }else
            System.out.println("Enter a valid input");
    }
}
