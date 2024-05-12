package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 처음에 변수로 관리하는 게 까다로웠으니 배열로 관리해볼까
        // 좀 나아졌지만 인덱스가 꼬이기라도 하면...? => 이 문제 해결 위해 클래스 사용!

        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {90, 80, 80};

        for(int i=0; i<studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
