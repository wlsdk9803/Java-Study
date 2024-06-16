package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] fruitArr = fruits.split(",");
        for (String fruit : fruitArr) {
            System.out.println(fruit);
        }
        String joinedString = String.join("->", fruitArr);
        System.out.println("joinedString = " + joinedString);
    }
}
