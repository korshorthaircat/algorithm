package programmers.level2;

import java.util.*;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12981">영어 끝말잇기</a>
 */
public class Lesson12981 {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2]; // [탈락하는 사람 번호, 그 사람이 자신의 몇 번째 차례에서 탈락하는지]
        List<String> wordList = new ArrayList<>(); // 통과된 단어 저장용 목록

        for (int i = 0; i < words.length; i++) {
            if (!wordList.contains(words[i])) {
                if (i != 0) {
                    char formerWordLastLetter = words[i - 1].charAt(words[i - 1].length() - 1);
                    char latterWordFirstLetter = words[i].charAt(0);
                    if (formerWordLastLetter != latterWordFirstLetter) {
                        // 앞단어 끝글자와 뒷닷어 첫글자가 같지 않으면 탈락
                        answer[0] = i % n + 1;
                        answer[1] = i / n + 1;
                        break;
                    }
                }
                wordList.add(words[i]);
            } else {
                // 이미 앞에서 나온 단어이면 탈락
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        return answer;
    }
}
