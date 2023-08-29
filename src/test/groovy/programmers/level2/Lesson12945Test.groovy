package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson12945Test
 *
 * @author : USER
 */
class Lesson12945Test extends Specification {
    def "피보나치 수"() {
        when:
        def solution = Lesson12945.solution(n as int)

        then:
        solution == answer as int

        where:
        n | answer
        3 | 2
        5 | 5
    }
}