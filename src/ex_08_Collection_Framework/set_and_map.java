package ex_08_Collection_Framework;

import java.util.*;

public class set_and_map {

    static void main() {
        // Set - Natural Sorting** (also called **human sorting or alphanumeric sorting) arranges strings
        // the way humans expect, by recognizing **numbers inside strings as numbers, not as characters.

        // Set is an interface -> implementation of SET - HashSet, LinkedHashSet, TreeSet, EnumSet(Rarely Used)
        // HashSet -> hashing mechanism to store the elements -> hashcode -> random order of storing
        // LinkedHashSet -> LinkedList -> It will keep the order how they entered.
        // TreeSet -> red and black tree to store the elements(. they are in the natural sorted order)


        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();


        hs.add("abc");
        hs.add("def");
        hs.add("abc");


//        System.out.println(hs);


        Set<String> hsS = new HashSet<>();


        Set<String> thsS = new TreeSet<>();
        thsS.add("abc");
        thsS.add("def");
        thsS.add("abc");
        thsS.add("wsbwsb");

        System.out.println(thsS);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }




    }
}
