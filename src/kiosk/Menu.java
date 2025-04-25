package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private final List<MenuItem> menuBurgers = new ArrayList<>();

    // 기능(메서드)

    // 메뉴 추가
    public void addMenu(MenuItem menuItem) {
        menuBurgers.add(menuItem);
    }

    // 버거 메뉴판 조회 - 전체
    public void menuBoardBurger() {
        int num = 1;
        System.out.println("[ McDonaldo Menu - Burger]");
        for (MenuItem item : menuBurgers) {
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
        MenuItem select = menuBurgers.get(index-1);
        System.out.println(select);
    }

    public List<MenuItem> getMenuBurger() {
        return menuBurgers;
    }
}
