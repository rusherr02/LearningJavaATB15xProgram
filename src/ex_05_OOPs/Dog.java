package ex_05_OOPs;

public class Dog {

    String name;

    Dog(){
        System.out.println("Default constructor");
    }

    Dog(String namee){
        System.out.println("Dog constructor");
        name = namee;
    }

    void eat(){
        System.out.println("Eating");
    }

    void bark(){
        System.out.println("Barking");
    }
    void sleep(){
        System.out.println("Sleeping");
    }

    static void main() {
        Dog d = new Dog("kndd");
        d.eat();
        System.out.println(d.name);

        Dog d2  = new Dog("ksnkdd");
        d2.eat();
        System.out.println(d2.name);
    }

}
