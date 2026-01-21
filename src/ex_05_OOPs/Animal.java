package ex_05_OOPs;

class Animal {
    String name;

    Animal() {
        this.name="Animal";
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal {

    String name;

    Dog2() {
        this.name="Dog";
    }
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Test {
    static void main(String[] args) {
        Animal a = new Dog2();
        a.sound();
        System.out.println(a.name);
    }
}
