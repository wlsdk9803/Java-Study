package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount < 10){
            items[itemCount] = item;
            itemCount++;
        }
        else System.out.println("장바구니가 가득 찼습니다.");
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int total_sum = 0;
        for(Item item : items){
            if(item == null) break;
            total_sum += item.getTotal();
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotal());
        }
        System.out.println("전체 가격 합: " + total_sum); // 이건 따로 private 메서드 만들어서 사용해도 됨...!
    }
}
