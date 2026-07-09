class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        // Base case: if the tree is empty, the sum is 0.
        if (root == null) {
            return 0;
        }
        
        int sum = 0;
        
        // Check if the left child is a valid left leaf
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val; // Add the left leaf's value
        }
        
        // Recursively traverse the left and right subtrees
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        
        return sum;
    }
}