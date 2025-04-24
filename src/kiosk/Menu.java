package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<MenuItem> menuItems = new ArrayList<>();


    // 메뉴 추가
    public void addMenu(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    // 버거 메뉴판 조회 - 전체
    public void menuBoard() {
        int num = 1;
        for (MenuItem item : menuItems) {
            System.out.printf("%d.\t%s\t|\tW %.2f\t|\t%s%n",
                    num, item.getBurger(),
                    item.getPrice(),
                    item.getDescription());
            num++;
        }
        System.out.println(0 + ". \t 종료 \t |");
    }

    // 버거 메뉴판 - 단일 상품
    public void menuBoardSingle(int index) {
        if (index > 0 && index <= menuItems.size()) {
            MenuItem select = menuItems.get(index-1);
            System.out.println("선택한 메뉴는: " +
                    select.getBurger() +
                    " | W " + select.getPrice() +
                    " | " + select.getDescription());
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
    }

}
