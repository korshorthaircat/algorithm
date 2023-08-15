package level2;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Lesson42578 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List> clothesMap = new HashMap<>();

        // 맵에 키가 존재하지 않으면 리스트를 생성해 넣고, 키가 존재하면 밸류(리스트)를 꺼내서 리스트에 아이템 추가
        for (String[] clothe : clothes) {
            String itemCategory = clothe[clothe.length - 1];
            String itemName = clothe[0];

            List<String> itemList;
            if (clothesMap.keySet().contains(itemCategory)) {
                itemList = clothesMap.get(itemCategory);
            } else {
                itemList = new ArrayList<>();
            }
            itemList.add(itemName);
            clothesMap.put(itemCategory, itemList);
        }

        for (String itemCategory : clothesMap.keySet()) {
            int itemCount = clothesMap.get(itemCategory).size();
            answer *= itemCount + 1; // 해당 카테고리의 아이템을 안 입는 경우를 포함하기 위해 +1
        }

        return answer - 1; // 모든 카테고리의 아이템을 전부 입지 않는 경우를 제외하기 위해 -1
    }
}
