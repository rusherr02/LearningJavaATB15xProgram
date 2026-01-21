package ex_05_OOPs;

public class Person {

    String name;
    int age;
    int salary;
    long Phone_no;
    String address;
    boolean isMale;
    boolean isMarried;

//    public Person(String name, int age, int salary, long Phone_no, String address, boolean isMale, boolean isMarried){
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.Phone_no = Phone_no;
//        this.address = address;
//        this.isMale = isMale;
//        this.isMarried = isMarried;
//    }


    void speak(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    void work(){
        System.out.println(this.salary);
        System.out.println(this.Phone_no);
    }

    void eat(){
        System.out.println(this.isMale);
        System.out.println(this.isMarried);
    }



}
