package kiosk;

public class Main {

    public static void main(String[] args) {

        // 메뉴 객체
        Menu menu = new Menu();


        MenuItem double1955 = new MenuItem("Double 1955", 10.3, "113g 두툼한 순 쇠고기 패티, 특별한 1955 소스에 깊은 풍미의 그릴드 어니언까지");
        MenuItem bulgogiBurger = new MenuItem("Bulgogi Burger", 4.4, "100% 순 쇠고기 패티 두 장에 빅맥®만의 특별한 소스. 입안에서 살살 녹는 치즈와 신선한 양상추, 양파, 그리고 피클까지");
        MenuItem doubleCheeseburger = new MenuItem("Double Cheeseburger", 5.6, "고소하고 부드러운 치즈와 100% 순 쇠고기 패티가 두개, 맥도날드만의 더블 치즈버거!!");
        MenuItem mcChicken = new MenuItem("McChicken", 4.3, "바삭한 치킨 패티, 고소한 화이트 마요 소스와 아삭한 양상추가 함께! 더 업그레이드된 맛");

        menu.addMenu(double1955);
        menu.addMenu(bulgogiBurger);
        menu.addMenu(doubleCheeseburger);
        menu.addMenu(mcChicken);

        menu.menuBoardBurger();
        Kiosk kiosk = new Kiosk(menu);
        kiosk.startKiosk();

    }
}