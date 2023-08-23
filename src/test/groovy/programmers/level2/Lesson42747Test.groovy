package programmers.level2


import spock.lang.Specification

/**
 *
 * level2
 * Lesson42747Test
 *
 * @author : USER
 */
class Lesson42747Test extends Specification {
    def "H-Index"() {
        when:
        def solution = Lesson42747.solution(citations as int[])

        then:
        solution == answer as int

        where:
        citations                | answer
        [3, 0, 6, 1, 5]          | 3
        [2, 4, 6, 8, 10, 12, 14] | 5
        [2, 2, 2, 3, 4, 5]       | 3
        [1, 2, 3, 9, 9]          | 3
        [25, 8, 5, 3, 3]         | 3
        [3, 0, 6, 1, 5]          | 3
        [1, 4, 5]                | 2
        [5, 6, 7]                | 3
        [1, 4]                   | 1
    }
}
