package kiosk;

import java.util.Scanner;

public class Kiosk {

    // 속성
    public static Scanner scanner = new Scanner(System.in);
    private final Menu menu;

    // 생성자
    public Kiosk(Menu menu){
        this.menu = menu;
    }

    // 기능(메서드)
    // 입력, 반복문
    public void startKiosk (){
        menu.menuSelect();
        System.out.println("===============================");
        System.out.println("Welcome to ");
        System.out.print("메뉴를 선택해주세요: ");
        String inputStr = scanner.nextLine().trim(); // 메뉴 입력란
        int menuInput = Integer.parseInt(inputStr);//입력
        switch (menuInput){
            case 1: menuSelectBurger(); break;
            case 2: menuSelectDrink(); break;
            case 3: menuSelectDessert(); break;
            case 0: break;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요: ");
        }

//        if(menuInput == 1) { // 1. Burger 선택 시
//            menuSelectBurger();
//        }
    }



    // 1. Burger 선택 메서드
    public void menuSelectBurger() {
        menu.menuBoardBurger(); // Burger 메뉴 출력
        while (true){
            System.out.print("버거 종류를 선택해주세요(0: 종료): ");
            String burgerSelect = scanner.nextLine().trim();
            try { // 버거 메뉴 선택
                int bsNum = Integer.parseInt(burgerSelect); // 입력값 > 정수로
                if(bsNum == 0) { // 탈출
                    System.out.println("뒤로 돌아갑니다.");
                    menu.menuSelect();
                    break;
                } else if (bsNum >= 1 && bsNum <= menu.getBurgerMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuBurger(bsNum);
                } else {
                    System.out.println("잘못 입력하셨습니다: " + bsNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + burgerSelect);
            }
        }
    }

    // 2. Drink 선택 메서드
    public void menuSelectDrink() {
        menu.menuBoardDrink(); // Burger 메뉴 출력
        while (true){
            System.out.print("음료 종류를 선택해주세요(0: 종료): ");
            String drinkSelect = scanner.nextLine().trim();
            try { // 버거 메뉴 선택
                int dsNum = Integer.parseInt(drinkSelect); // 입력값 > 정수로
                if(dsNum == 0) { // 탈출
                    System.out.println("뒤로 돌아갑니다.");
                    menu.menuSelect();
                    break;
                } else if (dsNum >= 1 && dsNum <= menu.getBurgerMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuDrink(dsNum);
                } else {
                    System.out.println("잘못 입력하셨습니다: " + dsNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + drinkSelect);
            }
        }
    }

    public void menuSelectDessert() {
        menu.menuBoardDessert(); // Burger 메뉴 출력
        while (true){
            System.out.print("버거 종류를 선택해주세요(0: 종료): ");
            String dessertSelect = scanner.nextLine().trim();
            try { // 버거 메뉴 선택
                int dstNum = Integer.parseInt(dessertSelect); // 입력값 > 정수로
                if(dstNum == 0) { // 탈출
                    System.out.println("뒤로 돌아갑니다.");
                    menu.menuSelect();
                    break;
                } else if (dstNum >= 1 && dstNum <= menu.getBurgerMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuDessert(dstNum);
                } else {
                    System.out.println("잘못 입력하셨습니다: " + dstNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + dessertSelect);
            }
        }
    }





        // 기존 kiosk 동작
//        while(true){
//            System.out.print("버거 종류를 선택해주세요(0: 종료): ");
//            inputStr = scanner.nextLine().trim(); //입력
//            try {
//                inputKey = Integer.parseInt(inputStr); // 입력값 > 정수로
//                if(inputKey == 0) { // 탈출
//                    System.out.println("키오스크를 종료합니다.");
//                    break;
//                } else if (inputKey >= 1 && inputKey <= menu.getMenuBoard().size()) {
//                    // 버거 메뉴판 - 단일 상품 출력
//                    menu.menuBoardSingle(inputKey);
//                } else {
//                    System.out.println("잘못 입력하셨습니다: " + inputKey);
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("숫자를 입력해주세요: " + inputStr);
//            }
//
//        }










}
