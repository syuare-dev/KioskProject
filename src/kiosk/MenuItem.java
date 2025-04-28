package kiosk;

public class MenuItem {

    // 속성
    private final String burger;
    private final double price;
    private final String description;
    private final String category;

    // 생성자
    MenuItem(String burger, double price, String description, String category) {
        this.burger = burger;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // 기능(메서드)

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

    public String getCategory() {
        return category;
    }

    // 객체 데이터값 출력 형식 변경
    @Override
    public String toString() {
        return String.format("%-20s\t|\tW %-3.1f\t|\t%s", burger, price, description);
    }
}


