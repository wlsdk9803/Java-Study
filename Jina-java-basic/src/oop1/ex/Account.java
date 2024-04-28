package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        if(balance >= amount) balance -= amount;
        else System.out.println("잔액이 부족합니다.");
    }
    void printBalance(){
        System.out.println("잔고: " + balance);
    }
}