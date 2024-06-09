package lang.object.poly;

public class ObjectPloyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog; //모든 객체의 부모이기 때문에 dog에 담긴 값을 담을 수 있다.

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound();
//        obj.move();
        // 컴파일 에러. Object는 sound(), move() 메서드가 없다.

        //객체에 맞는 다운캐스팅 필요
//        if(obj instanceof Dog) { //방법1
//            ((Dog)obj).sound();
//        }
        if(obj instanceof Dog dog) { //방법2
            dog.sound();
        }
        else if (obj instanceof Car car) {
            car.move();
        }
    }
}
