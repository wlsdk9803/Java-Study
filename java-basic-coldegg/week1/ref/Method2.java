package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("김현철", 15, 90); //student1이라는 참조형 변수는 그저 참조값을 보관할 뿐
        System.out.println("실제 반환된 참조값: " + student1);
        Student student2 = createStudent("신철수",16,80); //student1이라는 참조형 변수는 그저 참조값을 보관할 뿐
        System.out.println("실제 반환된 참조값: " + student2);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); //초기화 => x001 참조값 생성
        student.name = name; //실제 참조값에 접근하여 메모리 데이터를 write하는 과정
        student.age = age;
        student.grade = grade;
        System.out.println("메소드 내부 생성 참조값: " + student);
        return student; //실제로 반환하는 것은 x001이라는 참조값뿐
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);

    }
}
