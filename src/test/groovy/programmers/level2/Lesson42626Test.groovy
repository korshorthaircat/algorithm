package programmers.level2

import programmers.level2.Lesson42626
import spock.lang.Specification

/**
 *
 * level2
 * Lesson42626Test
 *
 * @author : USER
 */
class Lesson42626Test extends Specification {
    def "더 맵게"() {
        when:
        def solution = Lesson42626.solution(scoville as int[], k as int)

        then:
        solution == answer as int

        where:
        scoville	          |  k	|  answer
        [1, 2, 3, 9, 10, 12]  |  7	|  2
        [5, 5, 5, 5]          |  5  |  0
        [1, 1, 1, 2, 2]       |  3  |  3
    }
}
