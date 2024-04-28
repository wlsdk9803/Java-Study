package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(){ // 다른 생성자로 인해 기본 생성자가 생성되지 않으므로 생성해줘야 함
        this("", "", 0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
