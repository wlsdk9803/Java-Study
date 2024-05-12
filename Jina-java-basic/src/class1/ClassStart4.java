package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // ClassStart3에서 출력 부분 마음에 안드니까 배열을 도입해 보자

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 80;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        // students는 크기가 3인 배열의 참조값을 가짐
        // 그 배열은 student1, student2, student3라는 student 타입의 참조값을 보관함
        // 예를 들어 student1이 x001이라고 하면 students[0]도 x001, student1도 x001 (자바는 값을 복사해서 전달하기 때문에 student1도 유지됨)

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
        System.out.println("이름: " + students[2].name + " 나이: " + students[2].age + " 성적: " + students[2].grade);
    }
}
