package oop1.ex;

public class Account {

    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("잔액부족");
        } else {
            balance -= amount;
        }
    }

    void printBalance() {
        System.out.println("현재 잔액은 " + balance + " 원 입니다.");
    }

}
