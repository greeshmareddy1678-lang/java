
interface Bank {
    void deposit();
    void withdraw();
}

class Codingal implements Bank {
    int balance = 1000;

    public void deposit() {
        balance += 500;
        System.out.println("Deposited: 500");
    }

    public void withdraw() {
        balance -= 200;
        System.out.println("Withdrawn: 200");
    }
}

public class Main {
    public static void main(String[] args) {
        Codingal c = new Codingal();

        System.out.println("Welcome to Codingal Bank!");
        c.deposit();
        c.withdraw();
        System.out.println("Balance: " + c.balance);
    }
}
