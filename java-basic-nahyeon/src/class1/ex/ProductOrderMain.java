package class1.ex;

//상품명: 두부, 가격: 2000, 수량: 2 상품명: 김치, 가격: 5000, 수량: 1 상품명: 콜라, 가격: 1500, 수량: 2 총 결제 금액: 12000

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder(); order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder(); order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder(); order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

//        orders[0].productName = "두부"; 이런 식으로 참조값 안 넣고 그냥 하면
//        Cannot assign field "productName" because "arr[0]" is null 에러가 뜬다..
//        orders[0].price = 2000;
//        orders[0].quantity = 2;
//
//        orders[1].productName = "김치";
//        orders[1].price = 5000;
//        orders[1].quantity = 1;
//
//        orders[2].productName = "콜라";
//        orders[2].price = 1500;
//        orders[2].quantity = 2;

        
        int sum = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            sum += order.price;
        }

        System.out.println("총 결제 금액 : " + sum);
    }
}
