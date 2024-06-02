package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }
    private static void action(Object obj){ // Object는 dog과 car을 담을 수 있다.
        //obj.sound(); // 컴파일 오류. Object는 sound()가 없다.
        //obj.move(); // 컴파일 오류. Object는 move()가 없다.

        // 객체에 맞는 다운캐스팅 필요 => 다형성을 활용하기에는 한계 존재
        if(obj instanceof Dog dog) dog.sound();
        else if(obj instanceof Car car) car.move();
    }
}
