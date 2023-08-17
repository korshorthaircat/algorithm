package level2

import spock.lang.Specification

class Lesson12913Test extends Specification {
    def "땅따먹기"() {
        when:
        def solution = Lesson12913.solution(land as int[][])

        then:
        solution == answer as int

        where:
        land	                         | answer
        [[1,2,3,5],[5,6,7,8],[4,3,2,1]]	 | 16
    }
}
