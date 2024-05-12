package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //학생 클래스를 기반으로 학생1 객체(인스턴스)를 정의하였다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; //student를 담을 수 있는 배열을 생성하고, 해당 배열에 인스턴스들의 참조값을 보관할 것임
        // 초기화 x시 null이 들어있음
        students[0] = student1; // 배열에 참조값 대입
        students[1] = student2;
        //자바에서 대입은 항상 변수에 들어있는 값을 복사한다.
        //변수에는 인스턴스 자체가 들어있는 것이 아니다.
        //따라서 대입 ( `=` )시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

        //배열에 들어있는 객체 사용하기
        System.out.println(students[0].name);
        System.out.println(students[0].age);
        System.out.println(students[0].grade);

        System.out.println(students[0].name);
        System.out.println(students[0].age);
        System.out.println(students[0].grade);
    }
}
