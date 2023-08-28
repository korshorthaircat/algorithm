package programmers.level2

import spock.lang.Specification

/**
 *
 * programmers.level2
 * Lesson17686Test
 *
 * @author : USER
 */
class Lesson17686Test extends Specification {
    def "[3차] 파일명 정렬"() {
        when:
        def solution = Lesson17686.solution(files as String[])

        then:
        solution == output as String[]

        where:
        files                                         | output
//        ["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]        | ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]
//        ["F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"] | ["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
//        ["muzi1.png", "MUZI1.png"]                                                          | ["muzi1.png", "MUZI1.png"]
//        ["MUZI2.png", "muzi1.png", "MUZI01.png"]                                            | ["muzi1.png", "MUZI01.png", "MUZI2.png"]
//        // 테일에도 숫자가 들어갈 수 있음 -> 파싱 로직 다시
//        ["muzi1.png1", "MUZI1.png2", "MUZI1.png3", "muzi1.png4"]                            | ["muzi1.png1", "MUZI1.png2", "MUZI1.png3", "muzi1.png4"]
//        ["img000012345", "img1.png", "img2", "IMG02"] | ["img000012345", "img1.png", "img2", "IMG02"]
        ["img1.png", "img2", "IMG02"]                 | ["img1.png", "img2", "IMG02"]
    }
}
