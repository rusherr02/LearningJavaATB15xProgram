package ex_02_Java_Basics;

public class Lab0012_if_else {
    static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        if(age > 18)
            System.out.println("You can vote");
        else
            System.out.println("\"You can't vote\"");

    }
}
