package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson12981Test
 *
 * @author : USER
 */
class Lesson12981Test extends Specification {
    def "영어 끝말잇기"() {
        when:
        def solution = Lesson12981.solution(n as int, words as String[])

        then:
        solution == result as int[]

        where:
        n | words                                                                                                                                                              | result
        3 | ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]                                                                                      | [3, 3]
        5 | ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"] | [0, 0]
        2 | ["hello", "one", "even", "never", "now", "world", "draw"]                                                                                                          | [1, 3]
    }
}
