package kiosk.lv7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Menu {

    // 속성
    // 카테고리별 메뉴 List
    private final List<MenuItem> burgerMenu = new ArrayList<>();
    private final List<MenuItem> drinkMenu = new ArrayList<>();
    private final List<MenuItem> dessertMenu = new ArrayList<>();


    // 기능(메서드)
    // 메뉴 추가 - category
    public void addMenu(MenuItem menuItem) {
        switch (menuItem.getCategory()) {
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
        IntStream // 순서가 있는 정수가 필요한 반복문 표현을 위해 IntStream 사용
                .range(0, burgerMenu.size()) // 0~burgerMenu의 사이즈 -1(index) 까지 stream 생성 (반복 종료 조건 생성)
                .forEach(num -> System.out.println((num+1) + ". " + burgerMenu.get(num))); // 반복 처리 > 출력 형식 설정

        System.out.println("0. 뒤로가기");
    }

    // 음료 메뉴 조회
    public void menuBoardDrink() {
        IntStream
                .range(0, drinkMenu.size())
                .forEach(num -> System.out.println((num+1) + ". " + drinkMenu.get(num)));

        System.out.println("0. 뒤로가기");
    }

    // 디저트 메뉴 조회
    public void menuBoardDessert() {
        IntStream
                .range(0, dessertMenu.size())
                .forEach(num -> System.out.println((num+1) + ". " + dessertMenu.get(num)));
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
