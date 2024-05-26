package week3.static2.ex;

public class Car {
    private String name;
    private static int count; //구매한 차량 인스턴스 내부가 아닌, 전체 차량 클래스에서 count가 필요하므로 static 선언

    public Car(String name){
        this.name = name;
        System.out.println("차량 구입, " + name);
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }

}
