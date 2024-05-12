package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        // for문 사용해서 출력 부분 리팩토링

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

        Student[] students = new Student[] {student1, student2, student3};

//        for(int i=0; i<students.length; i++){
//            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
//        }
        for(Student s : students){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
