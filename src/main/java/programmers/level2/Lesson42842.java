package programmers.level2;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42842">카펫</a>
 */
public class Lesson42842 {
    public static int[] solution(int brown, int yellow) {
        List<int[]> yellowWidthHeightList = new ArrayList<>(); // 노란색의 가로, 세로가 될 수 있는 경우를 배열로 보관함
        double tempHeight = Math.sqrt(yellow);
        for (int h = 1; h <= tempHeight; h++) {
            if (yellow % h == 0) {
                yellowWidthHeightList.add(new int[]{yellow / h, h}); // [가로, 세로]
            }
        }

        for (int[] yellowWidthHeightArr : yellowWidthHeightList) {
            int width = yellowWidthHeightArr[0];
            int height = yellowWidthHeightArr[1];
            if (brown == (width + 2) * (height + 2) - yellow) {
                return new int[]{width + 2, height + 2};
            }
        }
        return null;
    }
}
