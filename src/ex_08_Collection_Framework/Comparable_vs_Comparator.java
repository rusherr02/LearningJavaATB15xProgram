package ex_08_Collection_Framework;

import java.lang.*;
import java.util.*;

public class Comparable_vs_Comparator {

    static void main() {
//        Employee e1 = new Employee(3, "Amit");
//        Employee e2 = new Employee(1, "ABc");
//        Employee e3 = new Employee(2, "def");
//        Employee e4 = new Employee(0, "Aditi");
//
//        List<Employee> list = new ArrayList<>();
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//
//        System.out.println(list);
//
//        Collections.sort(list);
//
//        System.out.println(list);

        Emp2 e1 = new Emp2(3, "John", 1000);
        Emp2 e2 = new Emp2(2, "Jane", 1000);
        Emp2 e3 = new Emp2(3, "Julie", 1000);

        List<Emp2> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);

        Comparator<Emp2> idComp = (e11, e22) -> e11.id - e22.id;

        list.sort(idComp);
        System.out.println(list);




    }

}

class Employee implements Comparable<Employee> {

    private Integer id;
    private String name;
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String printDetails(){
        return id + " " + name;
    }

    @Override
    public int compareTo(Employee o) {
//        return this.id - o.id;
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

class Emp2 {
     Integer id;
     String name;
     Integer Salary;
    public Emp2(Integer id, String name, Integer Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
    public Emp2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSalary() {
        return this.Salary;
    }
    public void setSalary(Integer Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Emp2 [ id= " + id + ", name= " + name +  "Salary= "+ Salary + "]";
    }
}