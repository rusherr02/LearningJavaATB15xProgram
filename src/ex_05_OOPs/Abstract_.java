package ex_05_OOPs;

public class Abstract_ {
}

class Vehicle{

    public int maxSpeed = 180;
    Vehicle(){
        System.out.println("Def const.");
    }

    Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

}
class Car extends Vehicle{

    private int maxSpeed = 280;

    Car(int maxSpeed){
        super(100);
    }
}