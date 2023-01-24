package leetcode

import org.junit.Assert
import org.junit.Test
import yandex.SequencesCompare

class Yandex_Seq_Test {

    @Test
    fun `test1`() {
        Assert.assertEquals(SequencesCompare.compare("abc.", "abd."), true)
        Assert.assertEquals(SequencesCompare.compare("e.bc", "a.bc"), true)
        Assert.assertEquals(SequencesCompare.compare("e.bc", "bc"), true)
        Assert.assertEquals(SequencesCompare.compare("aaaa...", "bbbb..."), false)
        Assert.assertEquals(SequencesCompare.compare("aaaa....", "bbbb...."), true)
        Assert.assertEquals(SequencesCompare.compare("aaaa.....", "bbbb....."), true)
        Assert.assertEquals(SequencesCompare.compare(".....", "..."), true)
    }

    @Test
    fun `f2`() {

        Assert.assertEquals( "ab", SequencesCompare.withBackspaces("abc."))
        Assert.assertEquals( "a", SequencesCompare.withBackspaces("abc.."))
        Assert.assertEquals( "", SequencesCompare.withBackspaces("abc..."))
        Assert.assertEquals( "", SequencesCompare.withBackspaces("abc...."))
        Assert.assertEquals("", SequencesCompare.withBackspaces("...."))
    }
}