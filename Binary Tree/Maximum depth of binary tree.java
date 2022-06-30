// Question => https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        // calculating the height of left subtree
        int left = maxDepth(root.left);
        // calculating the height of right subtree
        int right = maxDepth(root.right);
        // calculating maximum amongst left and right
        ans = Math.max(left,right) + 1;
        return ans;
    }
}
// Time complexity => O(n)
