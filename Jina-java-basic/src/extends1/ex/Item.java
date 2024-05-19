package extends1.ex;

public class Item { // pubilc final class Item과 같이 final이 클래스에 붙으면 상속 불가
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public void print(){ // public final void print()와 같이 메서드에 final이 붙으면 오버라이딩 불가
        System.out.println("이름: " + name + ", 가격: " + price);
    }
}
