package bitwise

import org.junit.Test


class RightmostBitsTest {

    private val rightmostBits = RightmostBits()

    @Test
    fun isPower2() {
        rightmostBits.isPower2(2)
        rightmostBits.isPower2(3)
        rightmostBits.isPower2(4)
        rightmostBits.isPower2(25)
    }

    @Test
    fun turnOnRightmostBit() {
        (1..10).forEach { rightmostBits.turnOnRightmostBit(it) }
    }

    @Test
    fun turnOffTrailingBit() {
        (1..10).forEach { rightmostBits.turnOffTrailingBit(it) }
    }

    @Test
    fun turnOnTrailingBit() {
        (1..10).forEach { rightmostBits.turnOnTrailingBit(it) }
    }
}