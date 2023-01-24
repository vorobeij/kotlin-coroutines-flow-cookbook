package leetcode.tree

import leetcode.TreeNode
import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun test1() {
        Assert.assertEquals(
            -3,
            Solution().maxPathSum(TreeNode(-3))
        )
    }

    @Test
    fun test2() {
        Assert.assertEquals(
            42,
            Solution().maxPathSum(TreeNode(-10).apply {
                left = TreeNode(9)
                right = TreeNode(20).apply {
                    left = TreeNode(15)
                    right = TreeNode(7)
                }
            })
        )
    }

    @Test
    fun test3() {
        Assert.assertEquals(
            3,
            Solution().maxPathSum(
                TreeNode(1).apply {
                    left = TreeNode(-2).apply {
                        left = TreeNode(1).apply {
                            left = TreeNode(-1)
                        }
                        right = TreeNode(3)
                    }
                    right = TreeNode(-3).apply {
                        left = TreeNode(-2)
                    }
                })
        )
    }

    @Test
    fun test4() {
        Assert.assertEquals(
            48,
            Solution().maxPathSum(
                TreeNode(5).apply {
                    left = TreeNode(4).apply {
                        left = TreeNode(11).apply {
                            left = TreeNode(7).apply { }
                            right = TreeNode(2).apply { }
                        }
                    }
                    right = TreeNode(8).apply {
                        left = TreeNode(13)
                        right = TreeNode(4).apply {
                            right = TreeNode(1).apply { }
                        }
                    }
                })
        )

    }

    @Test
    fun test5() {
        Assert.assertEquals(
            16,
            Solution().maxPathSum(
                TreeNode(5).apply {
                    left = TreeNode(4).apply {
                        left = TreeNode(7).apply { }
                        right = TreeNode(2).apply { }
                    }
                })
        )

    }
}