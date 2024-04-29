package construct.ex;

public class BookMain {

    public static void main(String[] args) {
        //1. 기본 생성자
        Book book1 = new Book();
        book1.displayInfo();
        //2. title과 author만을 매개변수로 받는 생성자
        Book book2 = new Book("I love Java", "Chanran Park");
        book2.displayInfo();
        //3. 모든 필드를 매개변수로 받는 생성자
        Book book3 = new Book("You love Python", "Yoona Kim", 800);
        book3.displayInfo();

    }

}
