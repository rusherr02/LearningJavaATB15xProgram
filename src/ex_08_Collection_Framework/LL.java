package ex_08_Collection_Framework;

import java.util.*;
public class LL {
    static void main() {
//        List myList = new ArrayList();
//        List myList2 = new LinkedList();
//        myList2.add("A");
//        myList2.add("B");
//        myList2.add(12);
//
//        System.out.println(myList2);

        List<String> al = new ArrayList<>();
//        or
//        List<String> al1 = new ArrayList();
        al.add("Amit");
        al.add("Basu");
        al.add("Chetanaya");

//        System.out.println(al);

//        for(String s: al){
//            System.out.println(s);
//        }

//        for(int i=0;i<al.size();i++){
//            System.out.println(al.get(i));
//        }


//        Iterator<String> it = al.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());




        LinkedList<String> LL = new LinkedList<>();
        LL.add("Mango");
        LL.add("Berlin");
        LL.add("Daniel");
        LL.remove("Daniel");
        LL.remove("Amit");
        LL.addFirst("Amit");
        LL.addLast("Amit");
//        System.out.println(LL);


        System.out.println(LL.getFirst());
        System.out.println(LL.getLast());
        System.out.println(LL.get(2));
        System.out.println(LL.removeFirst());

        System.out.println(LL.size());
        System.out.println(LL.isEmpty());



    }
}


// Scenario 1 prone to modification - Linked List
// prone to accessing the elements - Array List
