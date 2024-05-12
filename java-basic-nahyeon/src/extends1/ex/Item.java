package extends1.ex;

public class Item { //부모 클래스
    private String name;
    private int price; // 공통 속성

    public Item(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }
}
