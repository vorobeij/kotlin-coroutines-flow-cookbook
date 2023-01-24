package leetcode.linkedlist

import com.google.common.truth.Truth
import org.junit.Test

class Solution_Intersection_of_Two_Linked_ListsTest {

    val t = Solution_Intersection_of_Two_Linked_Lists()

    @Test
    fun `test 1`() {
        test(intersectVal = 8, listA = listOf(4, 1, 8, 4, 5), listB = listOf(5, 6, 1, 8, 4, 5), skipA = 2, skipB = 3)
        test(intersectVal = 1, listA = listOf(1), listB = listOf(1), skipA = 0, skipB = 0)
    }

    fun test(intersectVal: Int, listA: List<Int>, listB: List<Int>, skipA: Int, skipB: Int) {

//        val remainder = listA.subList(skipA, listA.size).toNodes()
//        var headA = listA.subList(0, skipA).toNodes()
//        var headB = listB.subList(0, skipB).toNodes()
//        if (headA == null) headA = remainder else headA.last().next = remainder
//        if (headB == null) headA = remainder else headB.last().next = remainder
//
//        Truth.assertThat(t.getIntersectionNode(headA, headB)?.`val`).isEqualTo(intersectVal)
    }
}