package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12911">다음 큰 숫자</a>
 */
public class Lesson12911 {
    public static int solution(int n) {
        int countOfN = 0;
        String binaryN = Integer.toBinaryString(n);
        char[] binaryNArr = binaryN.toCharArray();
        for (char c : binaryNArr) {
            if (c == '1') {
                countOfN++;
            }
        }

        int nextBigNum = n + 1;
        int countOfNextBigNum = 0;
        while (true) {
            String binaryNextBigNum = Integer.toBinaryString(nextBigNum);
            char[] binaryNextBigNumArr = binaryNextBigNum.toCharArray();
            for (char c : binaryNextBigNumArr) {
                if (c == '1') {
                    countOfNextBigNum++;
                }
            }
            if (countOfN == countOfNextBigNum) {
                break;
            }
            countOfNextBigNum = 0;
            nextBigNum++;
        }

        return nextBigNum;
    }
}