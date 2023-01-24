package leetcode.contest

import com.google.common.truth.Truth
import org.junit.Test

class Solution_findLexSmallestStringTest {

    val t = Solution_findLexSmallestString()

    @Test
    fun `rotate`() {
        Truth.assertThat(t.rotate("2353", 2)).isEqualTo("5323")
        Truth.assertThat(t.add("2353", 2)).isEqualTo("2555")
        Truth.assertThat(t.add("3456", 5)).isEqualTo("3951")
        Truth.assertThat(t.findLexSmallestString("5525", 9, 2)).isEqualTo("2050")
    }
}