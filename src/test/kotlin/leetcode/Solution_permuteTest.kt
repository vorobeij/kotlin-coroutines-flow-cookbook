package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_permuteTest {
    val t = Solution_permute()

    @Test
    fun `test`() {
        Truth.assertThat(t.permute(intArrayOf(1, 2))).isEqualTo(listOf(listOf(1, 2), listOf(2, 1)))
    }
}