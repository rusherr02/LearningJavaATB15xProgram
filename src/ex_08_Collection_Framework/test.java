package ex_08_Collection_Framework;

public class test {
    static void main() {
//        Parent p = new Child();
//        p.show();
//        A a = new B();
//        a.show();
//        Outer o = new Outer();
//        Outer.Inner i = o.new Inner();
//        i.show();
        try { int a = 10/0; } catch (Exception e) { System.out.println("Catch"); } finally { System.out.println("Finally"); }
    }
}
//class Outer {
//    int x = 10;
//
//    class Inner {
//        void show() {
//            System.out.println(x);
//        }
//    }
//}