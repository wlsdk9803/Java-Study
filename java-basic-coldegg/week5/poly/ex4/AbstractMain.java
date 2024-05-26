package week5.poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        //추상클래스는 활용되지 않도록 하기 위한 클래스
        //인스턴스를 생성하려고 하면 컴파일 에러
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(cow);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    //동물이 추가 되어도 변하지 않는 코드
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
