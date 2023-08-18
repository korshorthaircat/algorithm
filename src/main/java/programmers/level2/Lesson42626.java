package programmers.level2;

import java.util.PriorityQueue;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 */
public class Lesson42626 {
    public static int solution(int[] scoville, int k) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int s : scoville) {
            priorityQueue.add(s);
        }

        while (priorityQueue.peek() < k) {
            if (priorityQueue.size() == 1) { // 모든 음식의 스코빌 지수를 k 이상으로 만들 수 없는 경우
                return -1;
            }

            Integer min = priorityQueue.poll();
            Integer secondMin = priorityQueue.poll();
            priorityQueue.add(min + secondMin * 2);
            answer++;
        }

        return answer;
    }
}
