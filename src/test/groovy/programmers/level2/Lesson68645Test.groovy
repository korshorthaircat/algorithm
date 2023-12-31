package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson68645Test
 *
 * @author : USER
 */
class Lesson68645Test extends Specification {
    def "삼각 달팽이"() {
        when:
        def solution = Lesson68645.solution(n as int)

        then:
        solution == result as int[]

        where:
        n | result
        4 | [1, 2, 9, 3, 10, 8, 4, 5, 6, 7]
        5 | [1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9]
        6 | [1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11]
    }
}