package kiosk;

import java.util.Scanner;

public class Kiosk {

    // 속성
    public static Scanner scanner = new Scanner(System.in);
    private final Menu menu;
    private final ShoppingCart shoppingCart = new ShoppingCart(); // 장바구니 List 초기화
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
            menuSelectMain(); // 메뉴 선택 메서드 호출
        } while (!escapeKey);
        System.out.println("===============================");
        System.out.println("맥도나루도 Kiosk를 종료합니다.\n감사합니다.");
    }

    // 0. 메뉴 선택
    public void menuSelectMain() {
        menu.menuSelect(); //
        System.out.println("===============================");
        System.out.print("메뉴를 선택해주세요: ");
        // 메뉴 입력란
        String inputStr = scanner.nextLine().trim();
        try {
            int menuInput = Integer.parseInt(inputStr); //입력
            switch (menuInput){
                case 1: menuSelectBurger(); break; // 1. 버거 메뉴
                case 2: menuSelectDrink(); break; // 2. 음료 메뉴
                case 3: menuSelectDessert(); break; // 3. 디저트 메뉴
                case 4: orderCart(); break; // 4. 장바구나 & 주문 메뉴
                case 0: escapeKey = true; break; // 0. 종료
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
            String burgerSelect = scanner.nextLine().trim(); // 문자열 입력
            try { // 버거 메뉴 선택
                int bsNum = Integer.parseInt(burgerSelect); // 입력값 > 정수로
                if(bsNum == 0) { // 탈출
                    System.out.println("===============================");
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                } else if (bsNum >= 1 && bsNum <= menu.getBurgerMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuBurger(bsNum);
                    BurgerAddToCart(bsNum); // 장바구니(버거) 추가
                    break;
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
        while (true){
            menu.menuBoardDrink(); // Drink 메뉴 출력
            System.out.println("===============================");
            System.out.print("음료 종류를 선택해주세요(0: 종료): ");
            String drinkSelect = scanner.nextLine().trim(); // 문자열 입력
            try { // 버거 메뉴 선택
                int dsNum = Integer.parseInt(drinkSelect); // 입력값 > 정수로
                if(dsNum == 0) { // 탈출
                    System.out.println("===============================");
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                } else if (dsNum >= 1 && dsNum <= menu.getDrinkMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuDrink(dsNum);
                    DrinkAddToCart(dsNum); // 장바구니(음료) 추가
                    break;
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
        while (true){
            menu.menuBoardDessert(); // Dessert 메뉴 출력
            System.out.println("===============================");
            System.out.print("디저트 종류를 선택해주세요(0: 종료): ");
            String dessertSelect = scanner.nextLine().trim(); // 문자열 입력
            try { // 버거 메뉴 선택
                int dstNum = Integer.parseInt(dessertSelect); // 입력값 > 정수로
                if(dstNum == 0) { // 탈출
                    System.out.println("===============================");
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                } else if (dstNum >= 1 && dstNum <= menu.getDessertMenu().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.singleMenuDessert(dstNum);
                    DessertAddToCart(dstNum); // 장바구니(디저트) 추가
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다: " + dstNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + dessertSelect);
            }
        }
    }

    // 장바구니 추가 - 버거 메뉴
    public void BurgerAddToCart(int index) {
        MenuItem select = menu.getBurgerMenu().get(index-1);
        checkAddToCart(select);
    }

    // 장바구니 추가 - 음료 메뉴
    public void DrinkAddToCart(int index) {
        MenuItem select = menu.getDrinkMenu().get(index-1);
        checkAddToCart(select);
    }

    // 장바구니 추가 - 디저트 메뉴
    public void DessertAddToCart(int index) {
        MenuItem select = menu.getDessertMenu().get(index-1);
        checkAddToCart(select);
    }


    // 장바구니 추가 메서드
    public void checkAddToCart(MenuItem menuItem) {
        while (true){
            System.out.println("===============================");
            System.out.print("장바구니에 추가하시겠습니까?(1:추가, 2:취소)");
            String inputKey = scanner.nextLine().trim(); // 문자열 입력
            try {
                int checkKey = Integer.parseInt(inputKey); // 입력값 > 정수로
                switch (checkKey) {
                    case 1:
                        shoppingCart.addToCart(menuItem); // 장바구니 추가
                        System.out.println("===============================");
                        System.out.println("해당 메뉴를 장바구니에 추가하셨습니다.");
                        orderCart(); // 장바구니 확인
                        return;
                    case 2:
                        System.out.println("===============================");
                        System.out.println("장바구니 추가를 취소하셨습니다.");
                        return; // 메서드 종료
                    default:
                        System.out.println("===============================");
                        System.out.println("잚못 입력하셨습니다: " + checkKey);
                        break; // 스위치문 종료 > 다시 입력 받기
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + inputKey);
            }
        }
    }

    // 장바구니 확인
    public void orderCart() {
        if(shoppingCart.getShoppingCart().isEmpty()){
            System.out.println("장바구니가 비어있습니다.");
        } else {
            shoppingCart.checkCart(); // 장바구니 메뉴 조회
            payToCart(); // 장바구니 결제
        }
    }

    // 장바구니 결제
    public void payToCart () {
        System.out.println("===============================");
        System.out.println("장바구니에 추가된 메뉴를 즉시 결제하시겠습니까?");
        System.out.println("1. 결제 \t 2.메뉴판으로 돌아가기");
        while (true){
            String inputKey = scanner.nextLine().trim(); // 문자열 입력
            try {
                int checkKey = Integer.parseInt(inputKey); // 입력값 정수로
                switch (checkKey){
                    case 1:
                        System.out.println("===============================");
                        System.out.println("결제가 완료되었습니다.");
                        System.out.printf("결제된 금액: W %-3.1f\n", shoppingCart.totalPrice()); // 장바구니 메뉴 총 금액
                        shoppingCart.removeCart(); // 장바구니 초기화
                        return;
                    case 2:
                        System.out.println("===============================");
                        System.out.println("메뉴판으로 돌아갑니다.");
                        return;
                    default:
                        System.out.println("===============================");
                        System.out.println("잚못 입력하셨습니다: " + checkKey);
                        break; // 스위치문 종료 > 다시 입력 받기
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + inputKey);
            }
        }
    }
}

