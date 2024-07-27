package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // 문제되는 부분
//        //ThreadA: A 사용자가 10000원 주문
//        statefulService1.order("userA", 10000);
//        //ThreadB: B 사용자가 20000원 주문
//        statefulService2.order("userB", 20000);
//
//        //ThreadA: 사용자A 주문 금액 조회
//        int price = statefulService1.getPrice();
//        System.out.println("price = " + price); // 20000원이 조회됨...1 사용자A는 10000원을 결제했는데...?
//
//        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);

        // 문제 해결
        //ThreadA: A 사용자가 10000원 주문
        int userAPrice = statefulService1.order("userA", 10000);
        //ThreadB: B 사용자가 20000원 주문
        int userBPrice = statefulService2.order("userB", 20000);

        System.out.println("userAPrice = " + userAPrice);
        Assertions.assertThat(userAPrice).isEqualTo(10000);
    }

    static class TestConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}