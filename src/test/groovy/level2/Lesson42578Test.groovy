package level2

import spock.lang.Specification

class Lesson42578Test extends Specification {
    def "의상"() {
        when:
        def solution = Lesson42578.solution(clothes as String[][])

        then:
        solution == answer as int

        where:
        clothes                                                                                     | answer
        [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]	| 5
        [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]	            | 3
    }
}
