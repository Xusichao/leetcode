import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 翻转二叉树
 */
public class Examination226 {
    /**
     * 递归
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tempNode = null;
        tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }

    /**
     * 深度优先遍历/先序遍历
     * @param root
     * @return
     */
    public TreeNode DFS(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            if (currentNode == null) continue;
            TreeNode tempNode;
            tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;

            stack.push(root.right);
            stack.push(root.left);
        }
        return root;
    }

    /**
     * 广度优先遍历/中序遍历
     * @param root
     * @return
     */
    public TreeNode BFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if (currentNode == null) continue;
            TreeNode tempNode;
            tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;

            queue.offer(root.left);
            queue.offer(root.right);
        }
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
