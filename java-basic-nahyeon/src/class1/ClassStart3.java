package class1;

/*
* 클래스가 필요한 이유
*
* 요구 사항:**
1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: `"이름: [이름] 나이: [나이] 성적: [성적]"` 4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
*
* - 그냥 다 쓰기 (학생 정보 따로 선언, 따로 출력)
* - 배열로 쓰고 for문으로 돌리기 (배열은 데이터 관리가 매우 불편, 실수 가능성 높음)
* - 클래스 쓰기 (사람이 관리하기 좋은 방식, 학생이라는 개념을 하나로 묶는 것)
*
*  */

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //학생 클래스를 기반으로 학생1 객체(인스턴스)를 정의하였다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //Student 타입을 받을 수 있는 변수를 선언한다
        //int는 정수를, String은 문자열을 받을 수 있는 것처럼 Student 타입의 객체(인스턴스)를 받을 수 있다
        // new 클래스명() -> 메모리에(힙 영역일듯) 할당, 멤버 변수 할당
        // 메모리 주소값을 student2에 저장하고 참조
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        /*
        * 클래스는 사용자 정의 타입을 만들기 위한 설계도
        * 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴수라 한다.
        *
        * 클래스 : 설계도
        * 객체/인스턴스 : 메모리에 만들어진 실체
        *
        * */

        System.out.println(student1); //참조값 확인 가능함
        System.out.println(student2);
//        class1.Student@a09ee92 패키지명.클래스명@참조값
//        class1.Student@30f39991

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
