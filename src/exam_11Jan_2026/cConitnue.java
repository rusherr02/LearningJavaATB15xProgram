package exam_11Jan_2026;


//Description:
//Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.

public class cConitnue {


    static void main() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if(i == 5)
                continue;
        }
    }
//    byte b = 300;
//    char c = ' ';
//    char d = 'a';a
}
