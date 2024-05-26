package week5.poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //InterfaceAnimal interfaceMain1 = new InterfaceAnimal();
        //추상클래스와 마찬가지로 인터페이스 인스턴스를 생성할 수 없음

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
