package codility

import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionKtTest {

    @Test fun solution() {
        assertEquals(5, Solution.solution(intArrayOf(5, 3, 4, 6, 2, 7)))
        assertEquals(3, Solution.solution(intArrayOf(50, 3, 2, 40, 2, 1, 70)))
        assertEquals(6, Solution.solution(intArrayOf(50, 9, 10, 5, 1, 1, 70)))
        assertEquals(6, Solution.solution(intArrayOf(1, 2, 3, 4, 5, 6)))
    }
}

