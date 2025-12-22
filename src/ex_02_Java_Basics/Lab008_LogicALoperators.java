package ex_02_Java_Basics;

public class Lab008_LogicALoperators {
    static void main(String[] args) {
        boolean a   = false;
        System.out.println(!a);
        System.out.println(a);

        boolean b = true;
        boolean c = b || a;
        System.out.println(c);

        boolean a1 = false && true;
        System.out.println(a1);

//        +

        int a22 = 10;
        int b22 = 20;
//        System.out.println(a22 + b22);

//        String
        String fn = "Pramod";
        String ls = "D";
//        System.out.println(fn + ls+(a22+b22));

//         + -> behave arth. int
//        + -> String
//        System.out.print((9 * 3 / 9 + 1) * 3);

//        System.out.println(10==20);
//        System.out.println(10==10);
//        System.out.println(!(10 > 20));

        int b12 = 12;
        boolean b11 = !(b12 > 10 || b12  < 5);
        System.out.println(b11);

//        int a = 10;
//        boolean b = (10 == 11);
//        System.out.print(b);


        long l = 100L;
//        char a111 = 'A';
//        char a2 = 'B';
        System.out.println("_________");
//        System.out.println((char)(a111 + a2));
//            System.out.println('A'== 65);
//        short s = 10;
//        int s = 10;
//        System.out.println(s+'B');





    }
}
