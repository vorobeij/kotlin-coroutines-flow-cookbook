package leetcode

import com.google.common.truth.Truth
import org.junit.Test


class Solution_GroupAnagramsTest {
    @Test
    fun `test 1`() {
        Truth.assertThat(Solution_GroupAnagrams().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
            .isEqualTo(
                listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))
            )
    }

    @Test
    fun `test 2`() {
        Truth.assertThat(Solution_GroupAnagrams().groupAnagrams(arrayOf("e")))
            .isEqualTo(
                listOf(listOf("e"))
            )
    }

    @Test
    fun `test 3`() {
        Truth.assertThat(Solution_GroupAnagrams().groupAnagrams(arrayOf("")))
            .isEqualTo(
                listOf(listOf(""))
            )
    }
}