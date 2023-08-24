package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson12909Test
 *
 * @author : USER
 */
class Lesson12909Test extends Specification {
    def "올바른 괄호"() {
        when:
        def solution = Lesson12909.solution(s as String)

        then:
        solution == answer as boolean

        where:
        s          | answer
        "()()"     | true
        "(())()"   | true
        ")()("     | false
        "(()("     | false
        "()))((()" | false
        ")"        | false // 반례 추가
    }
}
