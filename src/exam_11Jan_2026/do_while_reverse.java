package exam_11Jan_2026;

//Description:
//Write a Java program to reverse a given number using a do-while loop.

public class do_while_reverse {
    static void main(String[] args) {
        int i = 123;
        int ans = 0;
        do{
            int rem  = i % 10;
            ans = ans * 10 + rem;
            i= i / 10;

        }while (i > 0);
        System.out.println(ans);

    }
}
