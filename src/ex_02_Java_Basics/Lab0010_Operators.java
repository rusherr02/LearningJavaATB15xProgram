package ex_02_Java_Basics;

public class Lab0010_Operators {
    static void main(String[] args) {

//        byte s = 120;

//        > result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int marks = 100;

//        String result = (marks >= 40) ? "PASS" : "FAIL";
//        System.out.println(result);


        int x = 10;
        int y = 20;

        int max = x > y ? x : y;
        int min = x < y ? x : y;
//        System.out.println(max);

        // even - odd
        int num = 14;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);


        // max b/w 3 numbers
        int n1 = 2;
        int n2  = 9;
        int n3 = -11;

        int max1 = (n1 > n2 )? n1 : n2;
        int maxx = max > n3 ? max : n3;

        int maxND = (n1 > n2)
                ? ((n1 > n3) ? n1 : n3)
                : ((n2 > n3) ? n2 : n3);

        System.out.println(maxND);





    }
}
