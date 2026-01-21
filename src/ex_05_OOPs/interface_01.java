package ex_05_OOPs;

public class interface_01 {

}

interface Engine1{


    void run();
    void start();
    void stop();

    default void show(){
        System.out.println("show");
    }
}

interface Brakes{

}

class Car2 implements Engine1, Brakes{

    @Override
    public void run() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

