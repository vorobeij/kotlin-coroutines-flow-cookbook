package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_buildTreeTest {
    val t = Solution_buildTree()

    @Test
    fun `test`() {
        Truth.assertThat(t.test(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7)))
            .isEqualTo("[3,9,20,null,null,15,7]")
    }

    @Test
    fun `test 2`() {
        Truth.assertThat(t.test(intArrayOf(1, 2), intArrayOf(1, 2))).isEqualTo("[1,2]")
    }
}