package yandex

import org.junit.Assert.*
import org.junit.Test

class ZerosTest {

    @Test
    fun `test`() {
        assertEquals(0, Zeros.maxOnesSequence("".toIntArray()))
        assertEquals(0, Zeros.maxOnesSequence("0".toIntArray()))
        assertEquals(0, Zeros.maxOnesSequence("00".toIntArray()))
        assertEquals(1, Zeros.maxOnesSequence("01".toIntArray()))
        assertEquals(1, Zeros.maxOnesSequence("10".toIntArray()))
        assertEquals(1, Zeros.maxOnesSequence("11".toIntArray()))
        assertEquals(2, Zeros.maxOnesSequence("101".toIntArray()))
        assertEquals(5, Zeros.maxOnesSequence("0110111".toIntArray()))
        assertEquals(5, Zeros.maxOnesSequence("011111".toIntArray()))
        assertEquals(5, Zeros.maxOnesSequence("0111110".toIntArray()))
        assertEquals(3, Zeros.maxOnesSequence("011100110".toIntArray()))
    }

    private fun String.toIntArray() = toCharArray().map { it.code - 48 }
}