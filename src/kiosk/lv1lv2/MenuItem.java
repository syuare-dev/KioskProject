package kiosk.lv1lv2;

public class MenuItem {

    // 속성
    private final String burger;
    private final double price;
    private final String description;

    // 생성자
    MenuItem (String burger, double price, String description) {
        this.burger = burger;
        this.price = price;
        this.description = description;
    }

    public String getBurger() {
        return burger;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
