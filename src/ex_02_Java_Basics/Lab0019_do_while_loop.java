package ex_02_Java_Basics;

public class Lab0019_do_while_loop {
    static void main(String[] args) {
//       int i = 0;
//        do {
//            System.out.println(i);
//           i++;
//       }while (i > 100);
//        int t; System.out.outprintln(t);
//        int 123myvar = 83;
//        int $jn=44;
//        int h = 0b1020;
//        byte b = 0X0_______________________________________________F;
//        int value1 = 0b1010; // Decimal equivalent is 10
//        int a = 2 - -7; System.out.println(a);
//        short p = 1; short k = (short) (p + 2); System.out.println(k);
//        short k = 1; k += 2; System.out.println(k);
//        int a=5, b=10, c=15; a -= 3; b *= 2; c /= 5; System.out.println(a +" " + b + " " + c);
//         int a=10, b=6; int c = a+b*5; System.out.println(c);
//        int a = 5, b = 2; System.out.println(a / b);
//        System.out.println(true && (5 / 0 == 0));
//         int abcdefghijklmnopqrstuvwxyz_abcdefghijklmnopqrstuvwxyz_abcdefghijklmnopqrstuvwxyz_abcdefghijklmnopqrstuvwxyz_abcdefghijklmnopqrstuvwxyz = 1;
//        int enum = 9;
//        System.out.println(enum);
//        char charValue = 'A'; System.out.println(charValue);
//        byte b = 128; System.out.println(b);
//        int a = a = a = 999; System.out.println(a);
//        boolean valid = TRUE; System.out.println(valid);
//        int _123 = 99; System.out.println(_123);
//        char CHAR = 'A'; System.out.println(CHAR);
//        char ch; System.out.println(ch == 0);
//        int b, c; int a = b = c = 88; System.out.println(a); System.out.println(b); System.out.println(c);
//        int x; x = 5; { int y = 6; System.out.print(x + " " + y); } System.out.println(x + " " + y);
//        int x = 5; System.out.println(x++ + ++x);
//        int x = 10; int y = x++ + ++x + --x + x--;
//        System.out.println(y);
//        int a = 5, b = 2; System.out.println(a / b);
//        System.out.println(10 + 20 + "Java" + 10 + 20);
//        boolean b = false;
//        int x = 5; System.out.println(x++ + ++x);
//        if(1) { System.out.println("OK"); }
//        if(TRUE) System.out.println("GO"); else System.out.println("STOP");
//        int a=10;
//        if(a==9) System.out.println("OK ");
//        System.out.println("MASTER");
//        else System.out.println("BYE");
//        String name1="FOX", name2="DOG";
//        if(name1 == "FOX") System.out.print("FOX "); System.out.println("GOOD");
//        if(name2 == "CAT") System.out.println("DINO");
//        String name="dino"; if(name == "dino") System.out.print("DINO"); System.out.println("GOOD");
//        int marks=55; if(marks >= 80) System.out.println("DISTINCTION"); else if(marks >=35) System.out.println("PASS"); else System.out.println("FAIL");
//        int marks=85; if(marks >= 80) System.out.println("DISTINCTION"); else if(marks >=35) System.out.println("PASS");
//        float temp = 98.4f; if(temp > 98.4) { System.out.println("SUMMER"); } else { System.out.println("UNKNOWN"); }
//        long num = 123L; if(num > 123) { System.out.println("TIGER"); } else { System.out.println("BIRD"); }
//        int horses = 10; int camels = 5; if(horses > 5) { if(camels > 3) { System.out.println("FOREST"); } } else { System.out.println("CITY"); }
//        int horses = 10; int camels = 5; if(horses < 5) { System.out.println("TOWN"); } else if(horses >=5) System.out.print("FOREST "); System.out.println("AMAZON"); else System.out.println("UNKNOWN");
//        int marks=29; if(marks > 29); System.out.print("PASS "); System.out.println("RANK");
//        if(3>1) { 4; }
//        if(true) { break; System.out.println("ELEPHANT"); }
//        int x = 5; if(x > 3) if(x < 10) System.out.print("A"); else System.out.print("B");
//        boolean flag = false; if(flag = true) System.out.print("Yes"); else System.out.print("No");
//        int a = 0; if(a++) System.out.print("Hello"); else System.out.print("World");
//        int x = 1;
//        if(x = 5) System.out.println(x);
//        int a = 10; if(a > 5) System.out.print("A"); else if(a > 7) System.out.print("B"); else System.out.print("C");
//        int a = 3; if(a > 5) System.out.print("A"); else if(a > 7) System.out.print("B"); else System.out.print("C");
//        if(false) System.out.print("X"); System.out.print("Y");
//        int x = 7; if(x > 5) System.out.print("A"); System.out.print("B");
//        int n = 4; if(n % 2 == 0) System.out.print("Even"); else System.out.print("Odd");
//        int x = 10; if(x < 5) System.out.print("Small"); else if(x < 15) System.out.print("Medium"); else System.out.print("Large");
//        int a = 5, b = 2; if(a > 10) if(b > 1) System.out.print("A"); else System.out.print("B"); else System.out.print("C");
//        int x = 8; if(x > 5) if(x < 10) System.out.print("A"); else System.out.print("B"); else System.out.print("C");
//        int x = 3; if(x > 0) if(x > 5) System.out.print("Big"); else System.out.print("Small");
//
//        int n = 6; if(n % 2 == 0) if(n % 3 == 0) System.out.print("Divisible by 6"); else System.out.print("Even but not by 3"); else System.out.print("Odd");
//        int x = 4; if(x > 0) if(x < 0) System.out.print("Impossible"); else System.out.print("Possible");
//        int x = 2; if(x == 2) if(x > 0) if(x < 5) System.out.print("Nested");
//        int a = 3; if(a > 0) if(a > 2) if(a > 4) System.out.print("A"); else System.out.print("B"); else System.out.print("C"); else System.out.print("D");
//        int x = 1; if(x > 0) if(x > 2) System.out.print("A"); else if(x > -1) System.out.print("B"); else System.out.print("C"); else System.out.print("D");
//        int a=1; while(a<4) { System.out.print(a + " "); a++; }
//        int a=4; while(a>0) { System.out.print(a + " "); a--; }
//        String str="FOX"; int i=0; while(i<str.length()) { System.out.print(str.charAt(i)); i++; }
//        int cnt=0; while(true) { if(cnt > 4) break; if(cnt==0) { cnt++; continue; } System.out.print(cnt + ","); cnt++; }
//        int age=20; do { age++; }while(age<20); System.out.println(age);
//
//        int time=50; do { System.out.print(time + ","); time++; }while(time < 53);
//        char ch[] = {'A', 'B', 'C'}; int i=0; do { System.out.print(ch[i] + ","); i++; }while(i < ch.length);
//        String str[] = {"A","B","C"}; int i=0; do { if(i>= str.length) break; System.out.print(str[i] + ","); i++; }while(true);
//        for(int i=1; i<5; i++) { System.out.print(i +","); }
//        boolean[] ary = {true, false, true, true}; for(int i=0; i<ary.length; i++) { System.out.print(ary[i] +","); }
//        int score=1; for(; true; score++) { System.out.print(score +","); if(score > 3) break; }
//        for(int j=0; j<5;j++;) System.out.print(j + ",");
//        String names[] = {"MOGLI", "SHAREKHAN", "BALU"}; for(String str: names) { System.out.print(str + ","); }
//        String countries[] = {"BRAZIL", "CHILE", "SYDNEY"};
//        int i=0;
//        for(String str: countries) {
//            if(i<2) ;
//            else
//                break;
//            System.out.print(str + ","); i++;
//        }


//        int i=0; for(i=1; i<=6;i++) { if(i%3==0) continue; System.out.print(i+","); }






    }
}
