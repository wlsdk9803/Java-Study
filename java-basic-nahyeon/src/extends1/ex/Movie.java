package extends1.ex;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    //@override가 달리면 부모 클래스로 해당 함수를 검색하는데 이 때 부모클래스에 똑같은 함수 이름이 없으면 에러남
    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + director + ", 배우 : " + actor);
    }

}
