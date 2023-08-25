package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson70129Test
 *
 * @author : USER
 */
class Lesson70129Test extends Specification {
    def "이진 변환 반복하기"() {
        when:
        def solution = Lesson70129.solution(s as String)

        then:
        solution == result as int[]

        where:
        s              | result
        "110010101001" | [3, 8]
        "01110"        | [3, 3]
        "1111111"      | [4, 1]
    }
}