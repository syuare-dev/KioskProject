package kiosk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuHashMap {

    // 속성
    private final Map<String, List<MenuItem>> menuBoard = new HashMap<>();


    // 생성자
    public MenuHashMap(List<MenuItem> category) {
        for(MenuItem menuItem: category) {
            menuBoard
                    .computeIfAbsent(menuItem.getCategory(), key -> new ArrayList<>())
                    .add(menuItem);
            // computeIfAbsent(menuItem.getCategory(), key -> new ArrayList<>())
            // 외부에서 받은 menuItem 리스트를 하나씩 꺼내서
            // menuBoard 맵에 menuItem.getCategory() 키가 없을 경우 Lambda로 빈 ArrayList<MenuItem>을 생성한 후 put > 리스트 반환
            // 만약 key가 있으면 기존 저장된 리스트에 반환
            // add(menuItem): 반환된 리스트에 menuItem 객체 추가
        }
    }


    // 기능

    // 메뉴 출력



}
