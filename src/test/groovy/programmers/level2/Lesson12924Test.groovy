package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson12924Test
 *
 * @author : USER
 */
class Lesson12924Test extends Specification {
    def "숫자의 표현"() {
        when:
        def solution = Lesson12924.solution(n as int)

        then:
        solution == answer as int

        where:
        n  | answer
        15 | 4
    }
}