package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_champagneTowerTest {

    val t = Solution_champagneTower()

    @Test
    fun `test 1`() {
        Truth.assertThat(t.champagneTower(4, 2, 1)).isEqualTo(0.5)
        Truth.assertThat(t.champagneTower(4, 2, 0)).isEqualTo(0.25)
        Truth.assertThat(t.champagneTower(2, 1, 1)).isEqualTo(0.5)
        Truth.assertThat(t.champagneTower(25, 6, 1)).isEqualTo(0.18750)
//        Truth.assertThat(t.champagneTower(100000009, 33, 17)).isEqualTo(1.0)
    }
}