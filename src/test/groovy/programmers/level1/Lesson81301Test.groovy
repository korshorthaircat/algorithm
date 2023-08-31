package programmers.level1


import spock.lang.Specification

/**
 *
 * programmers.level1
 * Lesson81301Test
 *
 * @author : USER
 */
class Lesson81301Test extends Specification {
    def "숫자 문자열과 영단어"() {
        when:
        def solution = Lesson81301.solution(s as String)

        then:
        solution == result as int

        where:
        s                  | result
        "one4seveneight"   | 1478
        "23four5six7"      | 234567
        "2three45sixseven" | 234567
        "123"              | 123
    }
}