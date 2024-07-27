package hello.core.singleton;

public class StatefulService {

    // 문제가 생김
    private int price; //상태를 유지하는 필드

//    public void order(String name, int price){
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; //여기가 문제
//    }
//
//    public int getPrice() {
//        return price;
//    }

    // 문제 해결
    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        return price;
    }
}
