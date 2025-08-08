package Capitulo_03;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new Account();

        System.out.printf("Initial name is: %n%s%n", account);

        System.out.printf("Please enter the name:");

        String theName = scanner.nextLine();
        account.setName(theName);
        System.out.println("");

        System.out.printf("Name in object account is %n%s%n",
                account.getName());

    }
}
