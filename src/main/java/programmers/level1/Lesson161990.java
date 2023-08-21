package programmers.level1;

import java.util.*;

/**
 <a href="https://school.programmers.co.kr/learn/courses/30/lessons/161990">...</a>
 */
public class Lesson161990 {
    public static int[] solution(String[] wallpaper) {
        int topEnd = 0;
        int bottomEnd = 0;
        List<Integer> leftEndList = new ArrayList<>();
        List<Integer> rightEndList = new ArrayList<>();

        // 가장 위쪽 점 구하기
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                topEnd = i;
                break;
            }
        }

        // 가장 아래쪽 점 구하기
        for (int i = wallpaper.length - 1; 0 <= i; i--) {
            if (wallpaper[i].contains("#")) {
                bottomEnd = i;
                break;
            }
        }

        // 가장 왼쪽 점, 오른쪽 점 구하기
        for (String s : wallpaper) {
            if (s.contains("#")) {
                leftEndList.add(s.indexOf("#"));
                rightEndList.add(s.lastIndexOf("#"));
            }
        }
        int leftEnd = Collections.min(leftEndList);
        int rightEnd = Collections.max(rightEndList);


        return new int[]{topEnd, leftEnd, bottomEnd + 1, rightEnd + 1};
    }
}

