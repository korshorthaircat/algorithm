package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson42885Test
 *
 * @author : USER
 */
class Lesson42885Test extends Specification {
    def "구명보트"() {
        when:
        def solution = Lesson42885.solution(people as int[], limit as int)

        then:
        solution == answer as int

        where:
        people           | limit | answer
        [70, 50, 80, 50] | 100   | 3
        [70, 80, 50]     | 100   | 3
    }
}