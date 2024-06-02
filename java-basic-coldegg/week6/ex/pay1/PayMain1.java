package week6.ex.pay1;

public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();
        //카카오 페이
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //네이버 페이
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //결제 수단 X
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
