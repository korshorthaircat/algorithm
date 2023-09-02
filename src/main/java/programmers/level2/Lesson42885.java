package programmers.level2;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42885">구명보트</a>
 */
public class Lesson42885 {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int leftIdx = 0;
        int rightIdx = people.length - 1;

        while (leftIdx < rightIdx) {
            int sum = people[rightIdx] + people[leftIdx];
            if (sum <= limit) {
                rightIdx--;
                leftIdx++;
                count++;
            } else {
                rightIdx--;
                count++;
            }
        }

        if (leftIdx == rightIdx) {
            count++;
        }

        return count;
    }
}