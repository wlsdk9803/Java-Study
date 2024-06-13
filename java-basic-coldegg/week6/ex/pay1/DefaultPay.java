package week6.ex.pay1;

public class DefaultPay implements Pay {
//    결제 수단이 없을 경우
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 선택되지 않았습니다.");
        return false;
    }
}
