package Problems;

import java.util.Scanner;

public class Problem3 {
    static int Account_Balance = 10000;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1. Check Account Balance :");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose: ");

            int option = s.nextInt();

            if (option == 1) {
                Check_Balance();
            } else if (option == 2) {
                Deposit(s);
            } else if (option == 3) {
                Withdraw(s);
            } else if (option == 4) {
                System.out.println("Thank you For Visiting!");
                break;
            } else {
                System.out.println("Invalid Option! , Please Try Again");
            }

        }
    }

    // Check Balance
    static void Check_Balance() {
        System.out.println("Account Balance:" + Account_Balance + " ₹");
    }

    //Deposit
    static void Deposit(Scanner s) {
        System.out.println("Enter Amount :");
        int add_money = s.nextInt();

        Account_Balance = Account_Balance + add_money;
        System.out.println("Current Balance: " + Account_Balance + " ₹");
    }

    //Withdraw
    static void Withdraw(Scanner s) {
        System.out.println("Enter Withdrawal amount :");
        int Deduct_money = s.nextInt();
        if (Deduct_money > Account_Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Account_Balance = Account_Balance - Deduct_money;
            System.out.println("Current Account Balance:" + Account_Balance + " ₹");
        }
    }

}
