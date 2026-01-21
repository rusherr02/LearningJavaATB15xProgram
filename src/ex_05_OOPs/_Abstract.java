package ex_05_OOPs;

public class _Abstract {
}

abstract class Father{

    abstract void loan50K();
    void loan100K() {
        System.out.println("loan100K");
    }
}

class Son extends Father{
    @Override
    void loan50K() {
        System.out.println("loan50K");
    }
}
