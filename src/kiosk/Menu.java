package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    // 카테고리별 메뉴 List
    private final List<MenuItem> burgerMenu = new ArrayList<>();
    private final List<MenuItem> drinkMenu = new ArrayList<>();
    private final List<MenuItem> dessertMenu = new ArrayList<>();


    // 기능(메서드)
    // 메뉴 추가 - category
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

    // 버거 메뉴 조회
    public void menuBoardBurger() {
        int num =1;
        System.out.println("===============================");
        System.out.println("[ 맥도나루도 - 버거 ]");
        for(MenuItem item : burgerMenu) {
            System.out.println(num + ". " + item);
            num++;
        }

        System.out.println("0. 뒤로가기");
    }

    // 음료 메뉴 조회
    public void menuBoardDrink() {
        int num =1;
        System.out.println("===============================");
        System.out.println("[ 맥도나루도 - 음료 ]");
        for(MenuItem item : drinkMenu) {
            System.out.println(num + ". " + item);
            num++;
        }
        System.out.println("0. 뒤로가기");
    }

    // 디저트 메뉴 조회
    public void menuBoardDessert() {
        int num =1;
        System.out.println("===============================");
        System.out.println("[ 맥도나루도 - 디저트 ]");
        for(MenuItem item : dessertMenu) {
            System.out.println(num + ". " + item);
            num++;
        }
        System.out.println("0. 뒤로가기");
    }

    // 버거 메뉴 - 단품 조회
    public void singleMenuBurger(int index) {
        MenuItem select = burgerMenu.get(index-1);
        System.out.println("===============================");
        System.out.println(select);
    }

    // 음료 메뉴 - 단품 조회
    public void singleMenuDrink(int index) {
        MenuItem select = drinkMenu.get(index-1);
        System.out.println("===============================");
        System.out.println(select);
    }

    // 디저트 메뉴 - 단품 조회
    public void singleMenuDessert(int index) {
        MenuItem select = dessertMenu.get(index-1);
        System.out.println("===============================");
        System.out.println(select);
    }

    public List<MenuItem> getBurgerMenu() {
        return burgerMenu;
    }

    public List<MenuItem> getDrinkMenu() {
        return drinkMenu;
    }

    public List<MenuItem> getDessertMenu() {
        return dessertMenu;
    }

}
