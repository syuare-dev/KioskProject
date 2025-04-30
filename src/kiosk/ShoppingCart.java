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
        int num =1;
        System.out.println("==========장바구니 조회==========");

        if(getShoppingCart().isEmpty()){ // 장바구니가 비어있을 경우 출력
            System.out.println("장바구니가 비어있습니다.");
        } else { // 장바구니에 담긴 메뉴가 있을 경우 출력
            for (MenuItem list : getShoppingCart()) {
                System.out.println(num + ". " + list);
                num++;
            }
        }
        System.out.printf("- 총 금액: W %-3.1f\n",totalPrice());
    }

    public double totalPrice() {
        double totalPrice = 0;
        for(MenuItem tp : getShoppingCart()) {
            totalPrice += tp.getPrice();
        }
        return totalPrice;
    }

}
