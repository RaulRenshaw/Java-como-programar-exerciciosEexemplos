package Capitulo_03;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public double getBalance(){
        return balance;
    }

    public static void displayAccount(Account accountToDisplay){
        System.out.println(accountToDisplay);
    }

    public void withdraw(double withdrawal){
        if (withdrawal > balance){
            System.out.printf("Withdrawal amount exceeded account balance: balance %s e withdrawal: %s%n", balance, withdrawal);
        }else{
            balance -= withdrawal;
        }
    }



}
