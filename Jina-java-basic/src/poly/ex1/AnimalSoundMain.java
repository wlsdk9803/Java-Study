package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

//        System.out.println("동물 소리 테스트 시작");
//        cow.sound();
//        System.out.println("동물 소리 테스트 종료");
        soundCow(cow);

        // 코드 중복 발생 => 메서드 또는 배열, for문
        // 근데 이건 서로 완전히 다른 클래슨데...?
        // 아래 soundCow처럼 메서드 만들어도 클래스마다 일일이 만들어줘야 함...
        // 배열도 타입이 달라서 하나의 배열 안에 넣지 못함
    }
    private static void soundCow(Cow cow){
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
