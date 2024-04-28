package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); //초기화 => 참조값 생성
        initStudent(student1, "김현철", 15, 90); //메소드 내부에서 참조값에 접근하여 메모리에 적힌 데이터값을 write하게 됨

        Student student2 = new Student();
        initStudent(student2, "신철수",16,80);

        printStudent(student1);
        printStudent(student2);

       /* System.out.println("이름: " + student1.name + "나이: " + student1.age + "성적: " + student1.grade);
        System.out.println("이름: " + student2.name + "나이: " + student2.age + "성적: " + student2.grade);
*/
    }

    static void initStudent(Student student, String name, int
                            age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);

    }
}
