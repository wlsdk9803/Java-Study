package access;

public class BankAccount {
    private int balance;
    //데이터 필드는 외부에 직접 노출하지 않는다. `BankAccount` 가 제공하는 메서드를 통해서만 접근할 수 있다.

    // generate command + N 단축키

    public BankAccount() {
        this.balance = 0;
        // 어차피 int 초기값은 0..
    }

    //public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)){
            balance += amount;
        }
        else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: getBalance
    public int getBalance() {
         return balance;
    }

    //private 메서드 : 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이므로 private으로 생성
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 함 (유효한지 검증)
        return amount > 0; // 참이면 true, 거짓이면 false 반환
    }
}
