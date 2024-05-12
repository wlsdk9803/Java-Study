package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    //TODO 나머지 코드를 완성해라.

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (int i = 0; i < itemCount; i++) { // 3개밖에 안 담으면 그 이후는 null... pointerException
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
            sum += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합: " + sum);
        // 지금은 지역변수로 했는데 전체 가격 구하는 내부 메서드를 따로 만들어서 사용하는 방법 쓰기
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
