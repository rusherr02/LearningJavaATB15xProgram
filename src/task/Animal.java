package task;
class Animal {
    String name;

    Animal() {
        this.name="Animal";
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    String name;

    Dog() {
        this.name="Dog";
    }
    @Override
    void sound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal {
    String name;
    Cat() {
        this.name="Cat";
    }
    @Override
    void sound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

class Test {
    static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
//        System.out.println(a.name);
        Animal b = new Cat();
        b.sound();
    }
}

