package task;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int b){
        this.balance += b;
        System.out.println("Balance after deposit : " + b);
    }
    public void withdraw(int b){
        this.balance -= b;
        System.out.println("Balance after withdraw : " + b);
    }
    public int getBalance() {
        return this.balance;
    }

    static void main() {
        BankAccount b1 = new BankAccount(100);
        b1.deposit(1500);
        b1.withdraw(200);
    }
}

