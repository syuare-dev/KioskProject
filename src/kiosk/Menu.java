package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private final List<MenuItem> menuItems = new ArrayList<>();


    // 기능(메서드)

    // 메뉴 추가
    public void addMenu(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    // 버거 메뉴판 조회 - 전체
    public void menuBoard() {
        int num = 1;
        for (MenuItem item : menuItems) {
            System.out.printf("%d. %-20s\t| W %.1f\t|\t%s%n",
                    num, item.getBurger(),
                    item.getPrice(),
                    item.getDescription());
            num++;
        }
        System.out.printf("%d. %-18s\t|%n", 0, "종료");

    }

    // 버거 메뉴판 - 단일 상품
    public void menuBoardSingle(int index) {
        MenuItem select = menuItems.get(index-1);
        System.out.println("선택한 메뉴는: " +
                select.getBurger() +
                " | W " + select.getPrice() +
                " | " + select.getDescription());
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
