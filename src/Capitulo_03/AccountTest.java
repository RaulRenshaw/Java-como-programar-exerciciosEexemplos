package Capitulo_03;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Account account = new Account("john derheer");
        Account account2 = new Account("maria jose");

        System.out.printf("Name in object account is %n%s%n",
                account.getName());

        System.out.printf("Name in object account2 is %n%s%n",
                account2.getName());

    }
}
