package kiosk.lv1lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 컬렉션 MenuItem
        List<MenuItem> menuBoard = createMenuBoard();

        int num = 1;
        for (MenuItem item : menuBoard) {
            System.out.printf("%d.\t%s\t|\tW %.2f\t|\t%s%n",
                    num, item.getBurger(),
                    item.getPrice(),
                    item.getDescription());
            num++;
        }
        System.out.printf("%d.\t%s\t|\tW %.2f\t|\t%s%n", 0, "종료", 0.0, "키오스크 종료");


        System.out.print("메뉴를 선택해주세요(0: 종료): ");
        while(true){
            int inputKey = scanner.nextInt();
            if(inputKey == 0) {
                break;
            }
            else if (inputKey > 0 && inputKey <= menuBoard.size()) {
                MenuItem select = menuBoard.get(inputKey-1);
                System.out.println("선택한 메뉴는: " +
                        select.getBurger() +
                        " | W " + select.getPrice() +
                        " | " + select.getDescription());
            }
        }
        System.out.println("키오스크를 종료합니다.");
    }

    // MenuItems
    private static List<MenuItem> createMenuBoard() {
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuBoard = new ArrayList<>();
        menuBoard.add(shackBurger);
        menuBoard.add(smokeShack);
        menuBoard.add(cheeseburger);
        menuBoard.add(hamburger);
        return menuBoard;
    }
}


