import PublicClass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的深度
 */
public class Examination104 {
    /**
     * 递归做法
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }

    /**
     * 层次遍历做法
     * @param root
     * @return
     */
    private int BFS(TreeNode root){
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode currentTreeNode = queue.poll();
            if (currentTreeNode == null) break;
            depth++;
            queue.offer(root.left);
            queue.offer(root.right);
        }
        return depth;
    }
}
