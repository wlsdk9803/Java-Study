package poly.ex.pay1;


//null object pattern
//null 대신에 디폴트로 생성할 객체
public class DefaultPay implements Pay{

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
