package kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<MenuItem> shoppingCart = new ArrayList<>(); // 장바구니 List 초기화

    // 생성자

    public void addToCart(MenuItem menuItem) {
        shoppingCart.add(menuItem);
    }

    public void removeInCart(MenuItem menuItem){
        shoppingCart.remove(menuItem);
    }

    public List<MenuItem> getShoppingCart() {
        return new ArrayList<>(shoppingCart);
    }

    public void checkCart() {
        System.out.println("=======장바구니 조회========");
        for (MenuItem list : getShoppingCart()) {
            System.out.println(list);
        }
    }

}
