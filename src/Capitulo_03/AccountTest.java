package Capitulo_03;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Account account = new Account("john derheer", 50.00);
        Account account2 = new Account("maria jose", -7.53);


        Account.displayAccount(account);
        Account.displayAccount(account2);

        System.out.println("Enter deposit amount for account:");

        double depositAmount = scanner.nextDouble();

        System.out.printf("%nadding %.2f to account balande%n%n"
        , depositAmount);
        account.deposit(depositAmount);

        Account.displayAccount(account);
        Account.displayAccount(account2);

        System.out.println("Enter deposit amount for account2:");

        depositAmount = scanner.nextDouble();

        System.out.printf("%nadding %.2f to account2 balande%n%n"
                , depositAmount);
        account2.deposit(depositAmount);

        Account.displayAccount(account);
        Account.displayAccount(account2);

        account.withdraw(200);

    }
}
