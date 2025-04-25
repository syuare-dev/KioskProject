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
    public void startKiosk (){
        while(true){
            System.out.print("메뉴를 선택해주세요(0: 종료): ");
            String inputStr = scanner.nextLine().trim(); //입력
            try {
                int inputKey = Integer.parseInt(inputStr); // 입력값 > 정수로
                System.out.println("inputKey = " + inputKey); // inputKey 값 출력
                if(inputKey == 0) { // 탈출
                    System.out.println("키오스크를 종료합니다.");
                    break;
                } else if (inputKey >= 1 && inputKey <= menu.getMenuItems().size()) {
                    // 버거 메뉴판 - 단일 상품 출력
                    menu.menuBoardSingle(inputKey);
                } else {
                    System.out.println("잘못 입력하셨습니다: " + inputKey);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요: " + inputStr);
            }

        }
    }
}
