package task;

public class Employee {
    private String name;
    private int id;
    private int Salary;

    public Employee(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.Salary = sal;
    }

    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private int getId() {
        return this.id;
    }
    private void setId(int age) {
        this.id = id;
    }
    private int getSalary() {
        return this.Salary;
    }
    private void setSalary(int salary) {
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.Salary;
    }
    static void main() {
        Employee e1 = new Employee("John Doe", 1, 50000);
        System.out.println(e1);
    }

}

