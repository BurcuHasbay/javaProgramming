package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {


BankAccount account1 = new BankAccount();
account1.setInfo("Burcu Hasbay",236293,1500);

        System.out.println(account1);


        account1.deposit(1500);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        System.out.println("------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Osman Mert", 123464,4000);
        System.out.println(account2);
        account2.deposit(2000);
        account2.checkBalance();

        account2.withdraw(500);
        account2.checkBalance();

    }
}
