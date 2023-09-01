package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson42842Test
 *
 * @author : USER
 */
class Lesson42842Test extends Specification {
    def "카펫"() {
        when:
        def solution = Lesson42842.solution(brown as int, yellow as int)

        then:
        solution == answer as int[]

        where:
        brown | yellow | answer
        10    | 2      | [4, 3]
        8     | 1      | [3, 3]
        24    | 24     | [8, 6]
        28    | 36     | [8, 8]
    }
}
