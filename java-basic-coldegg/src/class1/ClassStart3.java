package class1;

public class ClassStart3 {
    public static void main(String[] args) {

        Student student1; //Student 클래스에 student1이라는 변수를 생성
        student1 = new Student(); //참조값: x001
        student1.name = "이영돈"; //학생1의 데이터
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //참조값: x002
        student2.name = "황정음"; //학생2의 데이터
        student2.age = 18;
        student2.grade = 70;

        Student[] students = new Student[2]; //Student 클래스 내부에 students라는 배열을 생성 Q. Student 내부 > student1, student2, student배열 이건지 or Student 내부 > student 배열 > student1, student2 이렇게 묶이는건지?
        students[0] = student1; //students의 0번째 원소 = student1 변수의 참조값
        students[1] = student2; //students의 1번째 원소 = student2 변수의 참조값

        System.out.println(students[0]); //class1.Student@b4c966a (student1의 참조값)

        student1.name = "김영돈"; //학생1의 이름 수정
        System.out.println(students[0]); //참조값 그대로 (배열은 참조값만을 담고있음)
        System.out.println(students[0].name); //변경된 객체의 정보를 참조값을 통해 그대로 데려옴

       /* System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적:" + students[1].grade);
*/
    }
}
