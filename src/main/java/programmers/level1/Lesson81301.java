package programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/81301">2021 카카오 채용연계형 인턴십 > 숫자 문자열과 영단어</a>
 */
public class Lesson81301 {
    public static int solution(String s) {
        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numberArr.length; i++) {
            if (s.contains(numberArr[i])) {
                s = s.replaceAll(numberArr[i], i + "");
            }
        }

        return Integer.parseInt(s);
    }
}