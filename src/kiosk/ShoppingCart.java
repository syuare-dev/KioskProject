package kiosk;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {

    private final List<MenuItem> shoppingCart = new ArrayList<>();

    // 생성자


    // 기능(메서드)

    // 장바구니에 메뉴 추가
    public void addToCart(MenuItem menuItem) {
        shoppingCart.add(menuItem);
    }

    // 장바구니에 포함된 메뉴 삭제
    public void removeCart(){
        shoppingCart.clear();
    }

    public List<MenuItem> getShoppingCart() {
        return new ArrayList<>(shoppingCart);
    }

    // 장바구니 조회
    public void checkCart() {
        int num =1;
        System.out.println("==========장바구니 조회==========");
        for (MenuItem list : getShoppingCart()) {
            System.out.println(num + ". " + list);
            num++;
        }
        System.out.printf("- 총 금액: W %-3.1f\n",totalPrice());
    }

    // 장바구니에 포함된 메뉴들의 금액 합산
    public double totalPrice() {
        // 금액 합산 조회 > Lambda&Stream
        return getShoppingCart()
                .stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();

    }
}
