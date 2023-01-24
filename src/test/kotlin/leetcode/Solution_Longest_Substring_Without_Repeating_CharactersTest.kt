package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_Longest_Substring_Without_Repeating_CharactersTest {
    private val t = Solution_Longest_Substring_Without_Repeating_Characters()

    @Test
    fun `test 1`() {
        Truth.assertThat(t.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3)
        Truth.assertThat(t.lengthOfLongestSubstring("abcabcbabac")).isEqualTo(3)
    }

    @Test
    fun `test 2`() {
        Truth.assertThat(t.lengthOfLongestSubstring("bbbbb")).isEqualTo(1)
        Truth.assertThat(t.lengthOfLongestSubstring("pwpwkew")).isEqualTo(4)
        Truth.assertThat(t.lengthOfLongestSubstring("a")).isEqualTo(1)
    }

    @Test
    fun `test 4`() {
        Truth.assertThat(t.lengthOfLongestSubstring("a")).isEqualTo(1)
    }

    @Test
    fun `test 3`() {
        Truth.assertThat(t.lengthOfLongestSubstring("pwwkew")).isEqualTo(3)
        Truth.assertThat(t.lengthOfLongestSubstring("")).isEqualTo(0)
        Truth.assertThat(t.lengthOfLongestSubstring(" ")).isEqualTo(1)
    }
}