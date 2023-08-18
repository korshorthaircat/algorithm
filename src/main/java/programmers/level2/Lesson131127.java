package programmers.level2;

import java.util.*;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/131127">...</a>
 */
public class Lesson131127 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        List<String> wantList = Arrays.asList(want);

        for (int i = 0; i < discount.length; i++) { // i = 할인 시작일자(=회원가입 시점)
            int[] numberForCheck = number.clone();
            for (int j = i; j < i + 10; j++) { // 할인 시작일자부터 연속하여 최대 10일 동안 할인 가능
                if (j <= discount.length - 1) { // 할인 시작일자부터 종료일자까지의 기간이 10일 이하인 경우를 고려함
                    if (wantList.contains(discount[j])) {
                        numberForCheck[wantList.indexOf(discount[j])] -= 1;
                    }
                }
            }
            // numberForCheck 배열의 모든 값이 0보다 작거나 같다면 answer++
            int countOfNegativeNumber = 0;
            for (int n : numberForCheck) {
                if (n <= 0) {
                    countOfNegativeNumber++;
                }
            }
            if (countOfNegativeNumber == numberForCheck.length) {
                answer++;
            }
        }
        return answer;
    }
}
