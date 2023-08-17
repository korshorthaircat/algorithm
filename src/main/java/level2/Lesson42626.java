package level2;

import java.util.PriorityQueue;

/**
 * level2
 * Lesson42626
 *
 * @author : USER
 */
public class Lesson42626 {
    public static int solution(int[] scoville, int k) {
        int answer = 0;
        int count = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int s : scoville) {
            if (s >= k) {
                count++;
            }
            priorityQueue.add(s);
        }
        if (count == scoville.length) {
            return answer;
        }


        while (count != priorityQueue.size()) {
            count = 0;
            Integer min = priorityQueue.poll();
            Integer secondMin = priorityQueue.poll();
            priorityQueue.add(min + secondMin * 2);
            answer++;

            for (Integer s : priorityQueue) {
                if (s >= k) {
                    count++;
                }
            }
        }

        return answer;
    }
}
