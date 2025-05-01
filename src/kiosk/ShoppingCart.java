package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class ShoppingCart {

    private final List<MenuItem> shoppingCart = new ArrayList<>();

    // 생성자


    // 기능(메서드)

    // 장바구니에 메뉴 추가
    public void addToCart(MenuItem menuItem) {
        shoppingCart.add(menuItem);
    }
    public void delInCart(MenuItem menuItem) {
        shoppingCart.remove(menuItem);
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
        System.out.println("==========장바구니 조회==========");
        // 장바구니 조회 > Lambda&Stream 코드
        IntStream.range(0,getShoppingCart().size())
                .forEach(num -> System.out.println((num+1) + ". " + shoppingCart.get(num)));

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
