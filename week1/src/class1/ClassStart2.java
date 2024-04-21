package class1;  //!

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"이영돈","황정음", "삼정은"};
        int[] studentAges = {15,18,19};
        int[] studentGrades = {90,70,60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);

        }
    }
}
