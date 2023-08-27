package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/68645">삼각 달팽이</a>
 */
public class Lesson68645 {
    public static int[] solution(int n) {
        int[][] arr = new int[n][n];

        arr[0][0] = 1;
        for (int i = 0; i < n; i++) {
            arr[i+1][0] = arr[i][0]++;

            if (i == n - 1) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = arr[i - 1][j]++;
                }
            }
        }


        int[] answer = {};
        return answer;
    }
}