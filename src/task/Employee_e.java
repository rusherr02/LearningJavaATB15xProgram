package task;

abstract class Employee_e {
    abstract double calculateSalary();
}

class Manager extends Employee_e {
    private double baseSalary;
    private double bonus;

    Manager(double baseSalary, double bonus) {
//        super();
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee_e {
    private double hourlyRate;
    private int hoursWorked;

    Developer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
class mainn {
    static void main(String[] args) {
        Employee_e manager = new Manager(60000, 10000);
        Employee_e developer = new Developer(50, 160);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}



