
import java.util.Scanner;

class CBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000, choice, amount;

        System.out.println("Welcome to Codingal Bank!");4
        

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: Rs." + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                amount = sc.nextInt();
                balance += amount;
                System.out.println("New Balance: Rs." + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                amount = sc.nextInt();

                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("New Balance: Rs." + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

