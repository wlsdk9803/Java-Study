package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        soundAnimal(animalArr);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal[] animalArr) {
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
