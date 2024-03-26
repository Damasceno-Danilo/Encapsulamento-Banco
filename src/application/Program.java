package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char c = sc.next().charAt(0);
        if (c == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            account = new Account(number,holder,balance);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account);

        sc.close();
    }
}
