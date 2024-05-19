package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Animal dog = new Dog();이라고 해도 무방
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animalArr = {dog, cat, cow};
        
        // 동물이 추가되더라도 변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

    // 남은 문제
    // 1. Animal 클래스를 생성할 수 있음 (동물이라는 추상적인 개념이 필요한거지, 인스턴스를 만드는 건 좀 이상함)
    // 2. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성이 있음
    // => 추상 클래스, 추상 메서드
}
