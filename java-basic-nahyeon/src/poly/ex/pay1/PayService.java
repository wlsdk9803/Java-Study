package poly.ex.pay1;


public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        //pay 종류에 직접적 의존 -> 인터페이스 사용 필요
        Pay pay = PayStore.findPay(option);
        //pay라는 역할에만 의존하도록 변경.
        //payService라는 실질적인 클라이언트의 코드는 pay가 추가되어도 전혀 변경되지 않는다.

        //null이 들어가는 건 좋지 않음
//        if(pay != null){
//            result = pay.pay(amount);
//        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    // 결제 수단 구하는 로직 분리
    // 결제 수단이 추가되고 삭제될 때마다 코드가 바뀜 -> OCP 위배
    // 따라서 다른 클래스로 분리 -> 추상클래스의 static 메서드
//    public Pay findPay(String option) {
//        if (option.equals("kakao")) {
//            return new KakaoPay();
//        } else if (option.equals("naver")) {
//            return new NaverPay();
//        } else {
//            System.out.println("결제 수단이 없습니다.");
//            return null;
//        }
//    }

}
