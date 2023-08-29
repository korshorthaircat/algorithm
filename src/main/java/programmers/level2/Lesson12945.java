package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12945">피보나치 수</a>
 */
public class Lesson12945 {
    /*
    todo 시간초과
     */
    public static int solution(int n) {
        int number = function(n);
        return number % 1234567;
    }

    public static int function(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return function(n - 1) + function(n - 2);
    }
}