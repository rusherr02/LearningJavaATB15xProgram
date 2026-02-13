package task;

public class Student {

    public Student(String name, int rollNo, char section) {
        this.name = name;
        this.RollNo = rollNo;
        this.Section = section;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return this.RollNo;
    }
    public void setRolNo(int age) {
        this.RollNo = age;
    }
    private char getSection() {
        return this.Section;
    }
    private void setSection(char section) {
        this.Section = section;
    }

    private String name;
    private int RollNo;
    private char Section;

    @Override
    public String toString() {
        return this.name + " " + this.RollNo + " " + this.Section;
    }
    static void main() {
        Student s1 = new Student("Bob", 101, 'A');
        System.out.println(s1);
    }
}

