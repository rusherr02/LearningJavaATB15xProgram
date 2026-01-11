package exam_11Jan_2026;

//Description:
//Write a Java program to print all even numbers between 1 and 50 using a do-while loop.

public class do_while_print_even {
    static void main(String[] args) {
        int i = 0;
        do{
            if(i%2==0){
                System.out.println(i+" ");
            }
            i++;
        }while (i<=50);

    }
}
