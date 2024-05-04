package access;

public class BankAccount {
    private int balance; // public으로 설정하면 직접 갖다 써서 문제가 생길 수 있음

    public BankAccount(){
        balance = 0;
    } // 생략 가능

    // public 메서드: deposit
    public void deposit(int amount){
        if(isAmountValid(amount)) balance += amount;
        else System.out.println("유효하지 않은 금액입니다.");
    }

    // public 메서드: withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0) balance -= amount;
        else System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }

    // public 메서드: getBalance
    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount){
        // 금액이 0보다 커야함
        return amount > 0;
    } // public으로 설정하면 해당 클래스를 사용하는 개발자가 이 메서드를 사용해야 하는 지 혼란스러워 할 수 있음
}
