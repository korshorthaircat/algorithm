package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42747">H-index</a>
 */
public class Lesson42747 {
    public static int solution(int[] citations) {
        for (int h = citations.length; h > 0; h--) { // h의 최댓값(citations.length)부터 1씩 감소해가며 검사함
            int count = 0;

            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= h) {
                    count++;
                }
            }

            if (h <= count) {
                return h;
            }
        }
        return 0;
    }
}