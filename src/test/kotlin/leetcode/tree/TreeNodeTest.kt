package leetcode.tree

import leetcode.TreeNode
import org.junit.Assert
import org.junit.Test

class TreeNodeTest {

    @Test fun string() {
        val root = TreeNode(1)
        Assert.assertEquals("1", root.toString())
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        Assert.assertEquals("1,2,3", root.toString())
    }

    @Test fun string2() {
        val root = TreeNode(-10).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        Assert.assertEquals("-10,9,20,null,null,15,7", root.toString())
    }

    //    @Test fun test3() {
    //        Assert.assertEquals(
    //            "-10,9,20,null,null,15,7",
    //            "-10,9,20,null,null,15,7".toTree().toString()
    //        )
    //    }
}