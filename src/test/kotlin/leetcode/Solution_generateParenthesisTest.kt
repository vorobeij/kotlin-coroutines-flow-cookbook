package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_generateParenthesisTest {

    val t = Solution_generateParenthesis()

    @Test
    fun `test`(){
        Truth.assertThat(t.isCorrectSequence("()()")).isEqualTo(true)
        Truth.assertThat(t.isCorrectSequence("(())")).isEqualTo(true)
    }

    @Test
    fun `generate`(){
//        Truth.assertThat(t.generateParenthesis(1)).isEqualTo(listOf("()"))
        Truth.assertThat(t.generateParenthesis(2)).isEqualTo(listOf("()()", "(())"))
    }
}