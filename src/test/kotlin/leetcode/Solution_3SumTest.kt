package leetcode

import com.google.common.truth.Truth
import leetcode.Solution_3Sum.Companion.distinctN
import org.junit.Test
import kotlin.random.Random

class Solution_3SumTest {

    @Test
    fun `result should be empty`() {
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf())).isEmpty()
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf(0))).isEmpty()
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf(0, 1))).isEmpty()
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf(0, 1, 2))).isEmpty()
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf(0, 0, 0))).isEqualTo(listOf(listOf(0, 0, 0)))
    }

    @Test
    fun `result`() {
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf(-1, 0, 1))).isEqualTo(listOf(listOf(-1, 0, 1)))
        Truth.assertThat(Solution_3Sum().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
            .isEqualTo(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)))
    }

    @Test
    fun `distinct n`() {
        Truth.assertThat(listOf(1, 1, 0, 1, 1).sorted().distinctN(2)).isEqualTo(listOf(0, 1, 1))
        Truth.assertThat(listOf(1, 1, 0, 0, 0, 0, 1, 1).sorted().distinctN(2)).isEqualTo(listOf(0, 0, 0, 1, 1))
    }

    @Test
    fun `extreme list`() {
        fun sign(): Int {
            val f = Random.nextFloat()
            return if (f < 0.5) -1 else 1
        }

        val list = (0..30000).map { it % 6 * sign() }
        Truth.assertThat(list.sorted().distinctN(2))
            .isEqualTo(listOf(-5, -5, -4, -4, -3, -3, -2, -2, -1, -1, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5))

        Truth.assertThat(Solution_3Sum().threeSum(list.toIntArray())).isEqualTo(
            listOf(
                listOf(-5, 0, 5),
                listOf(-5, 1, 4),
                listOf(-5, 2, 3),
                listOf(-4, -1, 5),
                listOf(-4, 0, 4),
                listOf(-4, 1, 3),
                listOf(-4, 2, 2),
                listOf(-3, -2, 5),
                listOf(-3, -1, 4),
                listOf(-3, 0, 3),
                listOf(-3, 1, 2),
                listOf(-2, -2, 4),
                listOf(-2, -1, 3),
                listOf(-2, 0, 2),
                listOf(-2, 1, 1),
                listOf(-1, -1, 2),
                listOf(-1, 0, 1),
                listOf(0, 0, 0)
            )
        )
    }
}