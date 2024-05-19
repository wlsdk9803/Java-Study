package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
    private static void soundAnimal(Animal animal){ // 파라미터 타입이 여기 핵심! // 부모는 자식을 담을 수 있다.
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩. 오버라이딩 된 게 우선순위 높음!
        System.out.println("동물 소리 테스트 종료");
    }
}
