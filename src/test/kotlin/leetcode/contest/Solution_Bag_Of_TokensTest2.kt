package leetcode.contest

import com.google.common.truth.Truth
import org.junit.Test

class Solution_Bag_Of_TokensTest2 {

    val t = Solution_Bag_Of_Tokens2()

    @Test
    fun `test 1`() {
        Truth.assertThat(t.bagOfTokensScore(intArrayOf(100), 50)).isEqualTo(0)
        Truth.assertThat(t.bagOfTokensScore(intArrayOf(100, 200), 150)).isEqualTo(1)
    }

    @Test
    fun `test 2`() {
        Truth.assertThat(t.bagOfTokensScore(intArrayOf(100, 200, 300, 400), 200)).isEqualTo(2)
    }

    @Test
    fun `test 3`() {
        Truth.assertThat(t.bagOfTokensScore(intArrayOf(48, 87, 26), 81)).isEqualTo(2)
    }
}