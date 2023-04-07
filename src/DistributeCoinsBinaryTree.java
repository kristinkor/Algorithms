public class DistributeCoinsBinaryTree {
    private static int count;
    public int distributeCoins(TreeNode root) {
    count = 0;
    count_nodes(root);
    return count;
    }

    private static int count_nodes(TreeNode node) {
        if(node == null){
            return 0;
        }
        int left = count_nodes(node.left);
        int right = count_nodes(node.right);
        count += Math.abs(left) + Math.abs(right);
        return node.val + left + right - 1;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}