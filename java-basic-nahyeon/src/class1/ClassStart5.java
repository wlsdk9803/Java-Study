package class1;

public class ClassStart5 {
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

        Student[] students = new Student[]{student1, student2}; // 생성 선언 동시에

        // 배열 적용
        for (int i = 0; i < students.length; i++){
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++){
            Student s = students[i]; // s에 담아두고 쓰기
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        for (Student s : students) { //iter 단축키로 가능
            System.out.println("이름: " + s + " 나이: " + s.age + " 성적: " + s.grade);

        }
    }
}
