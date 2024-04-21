package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // class 버전 (객체 도입)
        // 참고: 객체와 인스턴스는 거의 비슷한 의미로 사용되지만, 인스턴스는 어떤 클래스에 속해 있는지 강조할 때 사용 (즉, 특정 클래스와의 관계를 명확히 할 때)

        Student student1;
        student1 = new Student(); // student1은 실제 메모리에 만들어진 객체의 참조 값
        student1.name = "학생1"; // '.'으로 실제 객체에 접근
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

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
        System.out.println("이름: " + student3.name + " 나이: " + student3.age + " 성적: " + student3.grade);
    }
}
