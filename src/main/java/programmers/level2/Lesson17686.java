package programmers.level2;

import java.util.*;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/17686">[3차] 파일명 정렬</a>
 */
public class Lesson17686 {
    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];

        List<File> fileList = new ArrayList<>();
        for (String file : files) {
            char[] fileChars = file.toCharArray();
            String head, number;
            int numberStartIdx= 0, numberEndIdx = 0;

            // 파싱
            for (int i = 0; i < fileChars.length; i++) {
                if (i != fileChars.length - 1) {
                    if (!('0' <= fileChars[i] && fileChars[i] <= '9') && ('0' <= fileChars[i + 1] && fileChars[i + 1] <= '9')) { // 현재 문자는 숫자가 아니면서 다음 문자는 숫자라면
                        numberStartIdx = i + 1;
                    }
                    if (('0' <= fileChars[i] && fileChars[i] <= '9') && !('0' <= fileChars[i + 1] && fileChars[i + 1] <= '9')) { // 현재 문자는 숫자이면서 다음 문자는  숫자가 아니라면
                        numberEndIdx = i;
                    }
                }
            }
            head = new String(Arrays.copyOfRange(fileChars, 0, numberStartIdx));
            number = new String(Arrays.copyOfRange(fileChars, numberStartIdx, numberEndIdx + 1));

            fileList.add(new File(head.toUpperCase(), number, file));
        }

        Collections.sort(fileList, (file1, file2) -> {
            if (file1.getHead().equals(file2.getHead())) {
                return Integer.parseInt(file1.getNumber()) - Integer.parseInt(file2.getNumber());
            }
            return file1.getHead().compareTo(file2.getHead());
        });

        // 정답 배열에 담기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = fileList.get(i).getOriginal();
        }
        return answer;
    }

    public static class File {
        public String head;
        public String number;
        public String original;

        public File(String head, String number, String original) {
            this.head = head;
            this.number = number;
            this.original = original;
        }

        public String getHead() {
            return head;
        }

        public String getNumber() {
            return number;
        }

        public String getOriginal() {
            return original;
        }
    }
}
