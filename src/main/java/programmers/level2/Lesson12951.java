package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12951">JadenCase 문자열 만들기</a>
 */
public class Lesson12951 {
    public static String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");

        if (s.lastIndexOf(' ') == s.length() - 1) { // 문자열의 가장 마지막에 공백을 포함하고 있다면 추가해주기
            words[words.length - 1] += ' ';
        }

        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();

            for (int j = 0; j < wordChars.length; j++) {
                if (j == 0 && 'a' <= wordChars[0] && wordChars[0] <= 'z') { // 첫 번재 글자가 소문자이면 대문자로 바꾸기
                    wordChars[j] += 'A' - 'a';
                }

                if (j != 0 && 'A' <= wordChars[j] && wordChars[j] <= 'Z') { // 두 번째 이후 글자가 대문자이면 소문자로 바꾸기
                    wordChars[j] -= 'A' - 'a';
                }
            }

            words[i] = new String(wordChars);
        }

        for (String word : words) {
            if (words.length == 1) {
                return words[0];
            } else {
                answer += word + " ";
            }
        }
        return answer.substring(0, answer.length() - 1);
    }
}
