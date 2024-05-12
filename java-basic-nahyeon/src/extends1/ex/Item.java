package extends1.ex;


//public final class Item { //상속 불가능
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

//    public final void print() { // 이러면 자식에서 해당 메서드 오버라이딩 불가능
    public void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }
}
