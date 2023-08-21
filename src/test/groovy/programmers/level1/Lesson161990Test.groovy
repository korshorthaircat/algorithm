package programmers.level1

import programmers.level2.Lesson131127
import spock.lang.Specification

/**
 *
 * programmers.level1
 * Lesson161990Test
 *
 * @author : USER
 */
class Lesson161990Test extends Specification {
    def "바탕화면 정리"() {
        when:
        def solution = Lesson161990.solution(wallpaper as String[])

        then:
        solution == result as int[]

        where:
        wallpaper                                                                                   | result
        [".#...", "..#..", "...#."]                                                                 | [0, 1, 3, 4]
        ["..........", ".....#....", "......##..", "...##.....", "....#....."]                      | [1, 3, 5, 8]
        [".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."] | [0, 0, 7, 9]
        ["..", "#."]                                                                                | [1, 0, 2, 1]
    }
}
