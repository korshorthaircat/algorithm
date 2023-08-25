package programmers.level2;

/**
 * 이진 변환 반복하기
 */
public class Lesson70129 {
    public static int[] solution(String s) {
        int[] answer = new int[2]; // [이진변환 횟수, 제거된 모든 0의 갯수]

        while (s.length() > 1) {
            char[] chars = s.toCharArray();
            int countOfOne = 0;
            for (char c : chars) {
                if (c == '1') {
                    countOfOne++;
                }
            }
            answer[1] += s.length() - countOfOne;
            answer[0]++;
            s = Integer.toBinaryString(countOfOne);
        }

        return answer;
    }
}
