//package leetcode.wix.lists
//
//import leetcode.linkedlist.string
//import leetcode.linkedlist.toNodes
//import org.junit.Assert
//import org.junit.Test
//
//class Solution_mergeTwoListsTest {
//
//    private val s = Solution_mergeTwoLists()
//
//    @Test
//    fun merge() {
//        assertMerge(
//            listOf(2),
//            listOf(1),
//            listOf(1, 2)
//        )
//    }
//
//    @Test
//    fun merge3() {
//        assertMerge(
//            listOf(1),
//            listOf(2),
//            listOf(1, 2)
//        )
//    }
//
//    @Test
//    fun merge4() {
//        assertMerge(
//            listOf(1, 3),
//            listOf(2),
//            listOf(1, 2, 3)
//        )
//    }
//
//    @Test
//    fun merge5() {
//        assertMerge(
//            listOf(1, 3),
//            listOf(2, 4),
//            listOf(1, 2, 3, 4)
//        )
//    }
//
//    @Test
//    fun merge6() {
//        assertMerge(
//            listOf(5),
//            listOf(1, 2, 4),
//            listOf(1, 2, 4, 5)
//        )
//    }
//
//    @Test
//    fun merge7() {
//        assertMerge(
//            listOf(-9, 3),
//            listOf(5, 7),
//            listOf(-9, 3, 5, 7)
//        )
//    }
//
//    @Test
//    fun merge2() {
//        assertMerge(
//            listOf(1, 2, 3),
//            listOf(1, 3, 4, 5),
//            listOf(1, 1, 2, 3, 3, 4, 5)
//        )
//    }
//
//
//    private fun assertMerge(nodes1: List<Int>, nodes2: List<Int>, result: List<Int>) {
//        Assert.assertEquals(
//            result.toNodes()?.string(),
//            s.mergeTwoLists(
//                nodes1.toNodes(),
//                nodes2.toNodes()
//            )?.string()
//        )
//    }
//}