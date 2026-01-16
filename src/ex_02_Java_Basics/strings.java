package ex_02_Java_Basics;

public class strings {

    static void main() {
//        String name = "P";
//        char c = 'P';
//        name.toUpperCase();

//        String str1 = "Hello World";
//        str1 = "abc";

//        CharSequence cs = "vced";
//        cs.toString();
//        System.out.println(cs);

         StringBuffer sb = new StringBuffer();
         sb.append("Hello");
         System.out.println(sb);
         sb.insert(0, "World");
         sb.replace(6,11, "Java");
         sb.reverse();
         System.out.println(sb.charAt(1));
         System.out.println(sb.length());
         System.out.println(sb.substring(3));

         StringBuilder  sb2 = new StringBuilder();
         sb2.append("Hello");
         sb2.insert(0, "World");



    }
}
