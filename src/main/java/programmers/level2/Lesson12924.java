package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12924">숫자의 표현</a>
 */
public class Lesson12924 {
    /*
    todo 효율성 테스트 fail
     */
    public static int solution(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (sumBetween1andN(i) - sumBetween1andN(j) == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double sumBetween1andN(int n) {
        return n * (n + 1) * 0.5;
    }
}