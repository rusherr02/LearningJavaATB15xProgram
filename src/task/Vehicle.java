package task;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}
class Main {
    static void main(String[] args) {
        // Create an array of Vehicle references holding Car and Bike objects
        Vehicle[] vehicles = {new Car(), new Bike()};

        // Call start() on each object
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}


