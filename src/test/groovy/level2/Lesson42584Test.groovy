package level2

import spock.lang.Specification

class Lesson42584Test extends Specification {
    def "주식가격"() {
        when:
        def solution = Lesson42584.solution(prices as int[])

        then:
        solution == answer as int[]

        where:
        prices	        | answer
        [1, 2, 3, 2, 3]	| [4, 3, 1, 1, 0]
        [5, 5, 5, 5, 5] | [4, 3, 2, 1, 0]
        [1, 2, 3, 4, 5] | [4, 3, 2, 1, 0]
        [3, 2, 1, 2, 3] | [1, 1, 2, 1, 0]
    }
}
