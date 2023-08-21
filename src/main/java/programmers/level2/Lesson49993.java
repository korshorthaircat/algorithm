package programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/49993">...</a>
 */
public class Lesson49993 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        char[] skillCharArray = skill.toCharArray();
        for (String skillTree : skill_trees) { // BACDE , ...
            int[] skillIdxArr = new int[skillCharArray.length];

            for (int i = 0; i < skillCharArray.length; i++) {
                char s = skillCharArray[i]; // C, B, D
                if (skillTree.contains(String.valueOf(s))) {
                    skillIdxArr[i] = skillTree.indexOf(s);
                }
            }

            if (isChecked(skillIdxArr)) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean isChecked(int[] checkArr) {
        for (int i = 0; i < checkArr.length - 1; i++) {
            if (checkArr[i] == -1 && i == checkArr.length - 1) {
                return true;
            }

            if (checkArr[i] == -1 && checkArr[i + 1] == -1) {
                return true;
            }

            if (checkArr[i] > checkArr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}


