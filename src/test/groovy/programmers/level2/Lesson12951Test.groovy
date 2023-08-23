package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson12951Test
 *
 * @author : USER
 */
class Lesson12951Test extends Specification {
    def "JadenCase 문자열 만들기"() {
        when:
        def solution = Lesson12951.solution(s as String)

        then:
        solution == answer as String

        where:
        s                                | answer
        "3people unFollowed me"          | "3people Unfollowed Me"
        "for the last week"              | "For The Last Week"
        "why dOes It always Rain on me " | "Why Does It Always Rain On Me "
    }
}
