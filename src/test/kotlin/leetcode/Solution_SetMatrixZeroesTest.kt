package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_SetMatrixZeroesTest {
    @Test
    fun `test 1`() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1)
        )
        val after = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1)
        )
        Solution_SetMatrixZeroes().setZeroes(matrix)
        Truth.assertThat(matrix).isEqualTo(after)
    }

    @Test
    fun `test 2`() {
        val matrix = arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5),
        )
        val after = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 4, 5, 0),
            intArrayOf(0, 3, 1, 0),
        )
        Solution_SetMatrixZeroes().setZeroes(matrix)
        Truth.assertThat(matrix).isEqualTo(after)
    }

    @Test
    fun `matrix test`() {
        Truth.assertThat(
            Solution_SetMatrixZeroes.Matrix(
                arrayOf(
                    intArrayOf(1, 0, 1),
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 1)
                )
            ).getZeroes()
        ).isEqualTo(listOf(Solution_SetMatrixZeroes.Point(1, 0)))
    }
}