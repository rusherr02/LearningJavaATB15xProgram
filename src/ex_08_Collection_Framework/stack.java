package ex_08_Collection_Framework;

import java.util.Stack;

public class stack {
    static void main() {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push("Book");
        s1.push(3);
        s1.push(4);


//        System.out.println(s1);
//        System.out.println(s1.isEmpty());
//        System.out.println(s1.size());
//        System.out.println(s1.peek());
//        System.out.println(s1.pop());
//        System.out.println(s1.peek());


        System.out.println(s1.push("Vijay"));
        System.out.println(s1.add("Chetan"));
        System.out.println(s1.add("Book"));
        System.out.println(s1.add("Chetan"));
        System.out.println(s1.push("1"));

        System.out.println(s1);

    }
}
