package poly.ex.pay1;

public abstract class PayStore {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")){
            return new NewPay();
        }
        else { //항상 null을 반환하지 않는다는 보장이 생김
            //nullpointerException 무조건 방지 => defultPay라는 클래스가 null을 대신하였다.
            return new DefaultPay();
        }
    }
}
