package kiosk;

import java.util.Scanner;

public class Kiosk {

    // 속성
    public static Scanner scanner = new Scanner(System.in);
    private final Menu menu;
    private final ShoppingCart shoppingCart = new ShoppingCart();
    private boolean escapeKey = false;

    // 생성자
    public Kiosk(Menu menu){
        this.menu = menu;
    }


    // 기능(메서드)
    // Kiosk 기능
    public void startKiosk (){
        System.out.println("===============================");
        System.out.println("맥도나루도에 오신 것을 환영합니다.");
        do {
            menuSelectMain();
        } while (!escapeKey);
        System.out.println("===============================");
        System.out.println("맥도나루도 Kiosk를 종료합니다.\n감사합니다.");
    }

    // 0. 메뉴 선택
    public void menuSelectMain() {
        menu.menuSelect();
        System.out.println("===============================");
        System.out.print("메뉴를 선택해주세요: ");
        // 메뉴 입력란
        String inputStr = scanner.nextLine().trim(); //
        try {
            int menuInput = Integer.parseInt(inputStr);//입력
            switch (menuInput){
                case 1: menuSelectBurger(); break;
                case 2: menuSelectDrink(); break;
                case 3: menuSelectDessert(); break;
                case 4: shoppingCart.checkCart(); break;
                case 0: escapeKey = true; break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요: ");
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요: " + inputStr);
        }
    }


    // 1. Burger 메뉴
    public void menuSelectBurger() {
        while (true){
            menu.menuBoardBurger(); // Burger 메뉴 출력
            System.out.println("===============================");
            System.out.print("버거 종류를 선택해주세요(0: 종료): ");
            String burgerSelect = scanner.nextLine().trim();
            try { // 버거 메뉴 선택
                int bsNum = Integer.parseInt(burgerSelect); // 입력값 > 정수로
                if(bsNum == 0) { // 탈출
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                } else if (bsNum >= 1 && bsNum <= menu.getBurgerMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuBurger(bsNum);
                    checkBurgerAddToCart(bsNum);
                } else {
                    System.out.println("잘못 입력하셨습니다: " + bsNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + burgerSelect);
            }
        }
    }

    // 2. Drink 메뉴
    public void menuSelectDrink() {
        System.out.println("===============================");
        menu.menuBoardDrink(); // Drink 메뉴 출력
        while (true){
            System.out.println("===============================");
            System.out.print("음료 종류를 선택해주세요(0: 종료): ");
            String drinkSelect = scanner.nextLine().trim();
            try { // 버거 메뉴 선택
                int dsNum = Integer.parseInt(drinkSelect); // 입력값 > 정수로
                if(dsNum == 0) { // 탈출
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                } else if (dsNum >= 1 && dsNum <= menu.getDrinkMenu().size()) {
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

    // 3. Dessert 메뉴
    public void menuSelectDessert() {
        System.out.println("===============================");
        menu.menuBoardDessert(); // Dessert 메뉴 출력
        while (true){
            System.out.println("===============================");
            System.out.print("디저트 종류를 선택해주세요(0: 종료): ");
            String dessertSelect = scanner.nextLine().trim();
            try { // 버거 메뉴 선택
                int dstNum = Integer.parseInt(dessertSelect); // 입력값 > 정수로
                if(dstNum == 0) { // 탈출
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                } else if (dstNum >= 1 && dstNum <= menu.getDessertMenu().size()) {
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

    // 장바구니 추가 여부 확인 - 버거 메뉴
    public void checkBurgerAddToCart(int index) {
        MenuItem select = menu.getBurgerMenu().get(index - 1);
        System.out.println("===============================");
        System.out.print("장바구니에 추가하시겠습니까?(1:추가, 2:취소)");
        String inputKey = scanner.nextLine().trim();
        try {
            int checkKey = Integer.parseInt(inputKey);
            System.out.println("checkKey = " + checkKey);
            switch (checkKey) {
                case 1:
                    shoppingCart.addToCart(select);
                    System.out.println("===============================");
                    System.out.println("해당 메뉴를 장바구니에 추가하셨습니다.");
                    System.out.println(select);
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.println("장바구니 추가를 취소하셨습니다.");
                    break;
                default:
                    System.out.println("===============================");
                    System.out.println("잚못 입력하셨습니다: " + inputKey);
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요: " + inputKey);
        }



    }
}
