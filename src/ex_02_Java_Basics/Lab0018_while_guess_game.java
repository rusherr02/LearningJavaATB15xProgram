package ex_02_Java_Basics;

import java.util.Random;
import java.util.Scanner;

public class Lab0018_while_guess_game {
    static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
//        System.out.println(num);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int guess;
        int attempts = 0;

        while(true){
            if(!input.hasNextInt()){
                System.out.println("Invalid input!");
                input.next();
                continue;
            }

            guess = input.nextInt();
            attempts++;

            if(guess < num) System.out.println("Too low try again!");
            else if(guess > num) System.out.println("Too high try again!");
            else {
                System.out.println(
                        "Congratulations! , It's the correct guess!" +"\n" + "You have taken -> " + attempts + " attempts"
                );
                break;
            }

        }



    }
}
