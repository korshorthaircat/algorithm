package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12945">피보나치 수</a>
 */
public class Lesson12945 {
    /*
    재귀로 문제 해결시 시간 복잡도가 O(2^n)이 됨
    -> 한번 구한 계산은 또 다시 계산하지 않고 이미 계산해둔 값을 가져다 쓴다면 시간 복잡도를 매우 줄일 수 있음. O(n)
    -> 동적 프로그래밍(Dynamic Programming), 메모이제이션(Memoization)

    todo 테스트13, 14 fail
     */
    public static int solution(int n) {
        return function(n) % 1234567;
    }

    static int[] memo = new int[100000];
    public static int function(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] != 0) {
            return memo[n];
        }

        return memo[n] = function(n - 1) + function(n - 2) % 1234567;
    }
}