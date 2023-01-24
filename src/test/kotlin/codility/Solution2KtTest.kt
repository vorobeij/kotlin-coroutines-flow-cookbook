package codility

import codility.cod.Solution2
import org.junit.Assert
import org.junit.Test

class Solution2KtTest {

    @Test
    fun solution() {
        Assert.assertEquals(6, Solution2.solution(intArrayOf(4, 2, 2, 4, 2, 1, 1, 1, 1, 1, 3)))
        Assert.assertEquals(5, Solution2.solution(intArrayOf(4, 2, 2, 4, 2)))
        Assert.assertEquals(3, Solution2.solution(intArrayOf(1, 2, 3, 2, 1)))
        Assert.assertEquals(3, Solution2.solution(intArrayOf(1, 2, 3, 2)))
        Assert.assertEquals(6, Solution2.solution(intArrayOf(2, 3, 2, 2, 3, 2, 1)))
        Assert.assertEquals(4, Solution2.solution(intArrayOf(0, 5, 4, 4, 5, 12)))
        Assert.assertEquals(2, Solution2.solution(intArrayOf(4, 4)))
    }
}