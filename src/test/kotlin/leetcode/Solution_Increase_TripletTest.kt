package leetcode

import com.google.common.truth.Truth
import org.junit.Test

class Solution_Increase_TripletTest {

    val t = Solution_Increase_Triplet()

    @Test
    fun `test 1`() {
        Truth.assertThat(t.increasingTriplet(intArrayOf(5, 1, 5, 5, 2, 5, 4))).isEqualTo(true)
    }

    @Test
    fun `test 2`() {
        Truth.assertThat(t.increasingTriplet(intArrayOf(1, 2, 3, 4, 5))).isEqualTo(true)
    }

    @Test
    fun `test 3`() {
        Truth.assertThat(t.increasingTriplet(intArrayOf(5, 4, 3, 2, 1))).isEqualTo(false)
    }
}