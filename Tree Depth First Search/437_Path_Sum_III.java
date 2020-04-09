class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int helper(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        if (sum - root.val == 0) {
            ++count;
        }

        count += helper(root.left, sum - root.val);
        count += helper(root.right, sum - root.val);

        return count;
    }
}
