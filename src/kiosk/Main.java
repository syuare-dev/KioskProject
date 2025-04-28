package kiosk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 메뉴 객체
        Menu menu = new Menu();

        MenuItem double1955 = new MenuItem("Double 1955", 10.3, "113g 두툼한 순 쇠고기 패티, 특별한 1955 소스에 깊은 풍미의 그릴드 어니언까지", "Burger");
        MenuItem bulgogiBurger = new MenuItem("Bulgogi Burger", 4.4, "100% 순 쇠고기 패티 두 장에 빅맥®만의 특별한 소스. 입안에서 살살 녹는 치즈와 신선한 양상추, 양파, 그리고 피클까지", "Burger");
        MenuItem doubleCheeseburger = new MenuItem("Double Cheeseburger", 5.6, "고소하고 부드러운 치즈와 100% 순 쇠고기 패티가 두개, 맥도날드만의 더블 치즈버거!!", "Burger");
        MenuItem mcChicken = new MenuItem("McChicken", 4.3, "바삭한 치킨 패티, 고소한 화이트 마요 소스와 아삭한 양상추가 함께! 더 업그레이드된 맛", "Burger");

        MenuItem cocaCola = new MenuItem("Coca-Cola", 3.1, "갈증해소 뿐만이 아니라 기분까지 상쾌하게! 코카-콜라","Drink");
        MenuItem sprite = new MenuItem("Sprite", 3.1, "청량함에 레몬, 라임향을 더한 시원함!","Drink");
        MenuItem peachIcedTea = new MenuItem("Peach Iced Tea", 3.6, "세계 3대 홍차, 우바산 홍차 베이스로 향긋하게 즐기는 복숭아 아이스티","Drink");
        MenuItem americano = new MenuItem("Americano", 3.1, "진한 에스프레소 샷에 따듯한 물을 섞어 더 향긋하게 즐기는 정통 아메리카노","Drink");

        MenuItem chocoChurros = new MenuItem("Choco Churros", 3.2, "바삭한 초코 츄러스에 가득찬 진한 초코 필링! 한입 크기로 즐기는 달콤한 초코 츄러스","Dessert");
        MenuItem oreoMcFlurry = new MenuItem("Oreo McFlurry", 4.3, "우유 듬뿍 신선한 아이스크림에 아삭아삭 오레오 쿠키가 가득!","Dessert");
        MenuItem oreoAffogato = new MenuItem("Oreo Affogato", 4.1, "진한 에스프레소에 바닐라 아이스크림으로 달콤 쌉쌀하게, 오레오 쿠키로 바삭함까지!","Dessert");
        MenuItem strawberryCone = new MenuItem("Strawberry Cone", 1.8, "신선한 1등급 원유와 딸기과즙으로 만든 아이스크림","Dessert");


        // 객체 데이터 추가
        for (MenuItem menuItem : Arrays.asList(
                double1955,
                bulgogiBurger,
                doubleCheeseburger,
                mcChicken,
                cocaCola,
                sprite,
                peachIcedTea,
                americano,
                chocoChurros,
                oreoMcFlurry,
                oreoAffogato,
                strawberryCone)) {
            menu.addMenu(menuItem);
        }

        // menu.menuBoardBurger();
        Kiosk kiosk = new Kiosk(menu);
        kiosk.startKiosk();

    }
}