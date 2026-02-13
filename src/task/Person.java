package task;

public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
    static void main() {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alice", 30);
        System.out.println(p1);
        System.out.println(p2);
    }
}

