package programmers.level2

import spock.lang.Specification

class Lesson49993Test extends Specification {
    def "스킬트리"() {
        when:
        def solution = Lesson49993.solution(skill as String, skill_trees as String[])

        then:
        solution == answer as int

        where:
        skill | skill_trees                       | answer
        "CBD" | ["BACDE", "CBADF", "AECB", "BDA"] | 2
    }
}
