package kiosk;

public class MenuItem {

    // 속성
    private final String burger;
    private final double price;
    private final String description;


    // 생성자
    MenuItem(String burger, double price, String description) {
        this.burger = burger;
        this.price = price;
        this.description = description;
    }

    // 버거 이름 조회
    public String getBurger() {
        return burger;
    }

    // 버거 가격 조회
    public double getPrice() {
        return price;
    }

    // 버거 설명 조회
    public String getDescription() {
        return description;
    }


    // 객체 데이터값 출력 형식 변경
    @Override
    public String toString() {
        return String.format("%s | %.2f원 | %s", burger, price, description);
    }
}


