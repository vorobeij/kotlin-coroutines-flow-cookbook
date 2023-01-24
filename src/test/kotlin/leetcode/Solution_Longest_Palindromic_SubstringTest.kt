package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_Longest_Palindromic_SubstringTest {

    val t = Solution_Longest_Palindromic_Substring()

    @Test
    fun `t 1`() {
        Truth.assertThat(t.longestPalindrome("aacabdkacaa")).isEqualTo("aca")
        Truth.assertThat(t.longestPalindrome("abbab")).isEqualTo("abba")
        Truth.assertThat(t.longestPalindrome("cbbd")).isEqualTo("bb")
        Truth.assertThat(t.longestPalindrome("a")).isEqualTo("a")
        Truth.assertThat(t.longestPalindrome("ac")).isEqualTo("a")
    }

    @Test
    fun `palindroome`() {
        Truth.assertThat(t.isPalindrome("acbca", 0, 4)).isEqualTo(true)
        Truth.assertThat(t.isPalindrome("abba", 0, 3)).isEqualTo(true)
        Truth.assertThat(t.isPalindrome("aca", 0, 2)).isEqualTo(true)
        Truth.assertThat(t.isPalindrome("aaca", 0, 3)).isEqualTo(false)
        Truth.assertThat(t.isPalindrome("acb", 0, 2)).isEqualTo(false)
        Truth.assertThat(t.isPalindrome("a", 0, 0)).isEqualTo(true)

    }
}