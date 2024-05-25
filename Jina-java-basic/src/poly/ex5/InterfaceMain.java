package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스는 인스턴스 생략 불가

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
