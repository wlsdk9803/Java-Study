package week3.src.access;

public class BankAccount {

    //잔액 데이터: private
    //계좌 잔고는 외부에서 직접 접근하지 않고 메소드 호출을 통해서만 값을 변경할 수 있게 함
    private int balance;

    public BankAccount() {
        balance = 0;
    }
    public int getBalance() {
        return balance;
    }

    //입금 기능: public
    public void deposit(int amount){
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //출금 기능: public
    public void withdraw(int amount){
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나, 잔액이 부족합니다.");
        }
    }

    private boolean isAmountValid(int amount){
        //검증: 금액이 0보다 커야함
        return amount > 0;
    }

}

