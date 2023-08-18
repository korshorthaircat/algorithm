package programmers.level2;

/**
https://school.programmers.co.kr/learn/courses/30/lessons/12913
 */
public class Lesson12913 {
    public static int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        return Math.max(Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), land[land.length-1][2]), land[land.length-1][3]);
    }
}
