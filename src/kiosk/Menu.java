package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    // 메뉴 저장 고간
    private final List<MenuItem> menuBoard = new ArrayList<>();
    private final List<MenuItem> burgerMenu = new ArrayList<>();
    private final List<MenuItem> drinkMenu = new ArrayList<>();
    private final List<MenuItem> dessertMenu = new ArrayList<>();


    // 기능(메서드)

    // 메뉴 추가 - category 별로 추가
    public void addMenu(MenuItem menuItem) {
        switch(menuItem.getCategory()) {
            case "Burger":
                burgerMenu.add(menuItem);
                break;
            case "Drink":
                drinkMenu.add(menuItem);
                break;
            case "Dessert":
                dessertMenu.add(menuItem);
                break;
        }
    }

    // 메뉴 추가
//    public void addMenu(MenuItem menuItem) {
//        menuBoard.add(menuItem);
//    }


    // 기본 메뉴
    public void menuSelect() {
        System.out.println("[ 맥도나루도 - 메뉴 ]");
        System.out.println("1. Burger");
        System.out.println("2. Drink");
        System.out.println("3. Dessert");
        System.out.println("0. Kiosk End");
    }

    // 버거 메뉴
    public void menuBoardBurger() {
        int num =1;
        System.out.println("[ 맥도나루도 - 버거 ]");
        for(MenuItem item : burgerMenu) {
            System.out.println(num + ". " + item);
            num++;
        }
    }

    public void menuBoardDrink() {
        int num =1;
        System.out.println("[ 맥도나루도 - 음료 ]");
        for(MenuItem item : drinkMenu) {
            System.out.println(num + ". " + item);
            num++;
        }
    }

    public void menuBoardDessert() {
        int num =1;
        System.out.println("[ 맥도나루도 - 디저트 ]");
        for(MenuItem item : dessertMenu) {
            System.out.println(num + ". " + item);
            num++;
        }
    }



    // 버거 메뉴판 조회 - 전체
//    public void menuBoardBurger() {
//
//        int num = 1;
//        System.out.println("[ 맥도나루도 - Burger]");
//        for (MenuItem item : menuBoard) {
//            System.out.println(num + ". " + item);
//            num++;
//        }
//        System.out.printf("%d. %-18s\t|%n", 0, "종료");
//    }

//    public void menuBoardBurger() {
//        int num = 1;
//        System.out.println("[ 맥도나루도 - Burger]");
//        for (MenuItem item : menuBoard) {
//            System.out.println(num + ". " + item);
//            num++;
//        }
//        System.out.printf("%d. %-18s\t|%n", 0, "종료");
//    }

    // 버거 메뉴판 - 단일 상품
//    public void menuBoardSingle(int index) {
//        MenuItem select = menuBoard.get(index-1);
//    }

    public void singleMenuBurger(int index) {
        MenuItem select = burgerMenu.get(index-1);
        System.out.println(select);
    }

    public void singleMenuDrink(int index) {
        MenuItem select = drinkMenu.get(index-1);
        System.out.println(select);
    }

    public void singleMenuDessert(int index) {
        MenuItem select = dessertMenu.get(index-1);
        System.out.println(select);
    }

    public List<MenuItem> getBurgerMenu() {
        return burgerMenu;
    }

    public List<MenuItem> getMenuBoard() {
        return menuBoard;
    }
}
