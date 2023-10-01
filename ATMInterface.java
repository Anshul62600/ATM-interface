package codecaveproject;

import java.util.Scanner;


    public class ATMInterface {
        private double balance;

        public ATMInterface(double initialBalance) {
            balance = initialBalance;
        }

        public void displayMenu() {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        }

        public void checkBalance() {
            System.out.println("Your balance is: $" + balance);
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("$" + amount + " deposited successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient amount.");
            }
        }

        public static void main(String[] args) {
            ATMInterface atm = new ATMInterface(1000.0);
            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                atm.displayMenu();
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            while (choice != 4);


        }
    }