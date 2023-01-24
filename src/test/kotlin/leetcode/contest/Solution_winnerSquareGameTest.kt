package leetcode.contest

import com.google.common.truth.Truth
import org.junit.Test

class Solution_winnerSquareGameTest {
    val t = Solution_winnerSquareGame()

    @Test
    fun `test1`() {
        Truth.assertThat(t.isSquare(1)).isEqualTo(true)
        Truth.assertThat(t.isSquare(2)).isEqualTo(false)
        Truth.assertThat(t.isSquare(3)).isEqualTo(false)
        Truth.assertThat(t.isSquare(4)).isEqualTo(true)
        Truth.assertThat(t.winnerSquareGame(1)).isEqualTo(true)
        Truth.assertThat(t.winnerSquareGame(2)).isEqualTo(false)
        Truth.assertThat(t.winnerSquareGame(3)).isEqualTo(true)
        Truth.assertThat(t.winnerSquareGame(4)).isEqualTo(true)
        Truth.assertThat(t.winnerSquareGame(5)).isEqualTo(false)
    }
}