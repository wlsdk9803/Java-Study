package lang.object.tostring;

public class toStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2); //println에 오브젝트를 넘겨서 그 안에서 tostring 호출

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int i = System.identityHashCode(dog1);

        System.out.println(i);

        String refValue = Integer.toHexString(i);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        String refValue3 = Integer.toHexString(System.identityHashCode(car));
        System.out.println("refValue = " + refValue);
        System.out.println("refValue2 = " + refValue2);
        System.out.println("refValue3 = " + refValue3);
    }
}
