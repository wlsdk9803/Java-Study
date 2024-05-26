package week3.access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    ///TODO 나머지 코드를 완성해라.
    public void addItem(Item item){
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");

        } else {
        items[itemCount] = item;
        itemCount++;
        }
    }

    public void displayItems(){
        System.out.println("<장바구니 상품 목록>");
        for (int i=0;i<itemCount;i++){
            Item item = items[i];//item[0]에 이미 item 객체가 있는 게 아닌가? 왜 해줘야 되는거지..
            System.out.println("상품명: " + item.getName() + " 합계: " + item.getPrice());

        }

        System.out.println("전체 가격 합: " + calculatePrice());

    }

    private int calculatePrice() {
        int total=0;
        for (int i=0;i<itemCount;i++){
            Item item = items[i];
            total += item.getPrice();
        }
        return total;
    }


}
