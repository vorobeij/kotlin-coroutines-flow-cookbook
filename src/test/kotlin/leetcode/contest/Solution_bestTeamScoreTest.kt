package leetcode.contest

import com.google.common.truth.Truth
import org.junit.Test

class Solution_bestTeamScoreTest {
    val t = Solution_bestTeamScore()

    @Test
    fun `ett1`() {
        Truth.assertThat(t.bestTeamScore(intArrayOf(4, 5, 6, 5), intArrayOf(2, 1, 2, 1))).isEqualTo(16)
    }
}