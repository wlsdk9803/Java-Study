package week3.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    //TODO 나머지 코드를 완성해라.
    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //1. item 객체 정보 출력
    public String getName(){ //public 자료형 메소드()
        return name;
    }
    public int getPrice(){
        return price*quantity;
    }

}



