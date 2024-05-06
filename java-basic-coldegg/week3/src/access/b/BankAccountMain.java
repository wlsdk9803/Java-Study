package week3.src.access.b;

import week3.src.access.BankAccount;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
//        account.balance = 2000; //error
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("잔고: "+account.getBalance());
    }
}
