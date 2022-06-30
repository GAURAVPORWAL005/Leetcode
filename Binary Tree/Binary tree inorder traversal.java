class Solution {
    // Creating the new list        
    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return ans;
        }
        // checking for left child
        inorderTraversal(root.left);
        // adding the value in list
        ans.add(root.val);
        // checking the right child
        inorderTraversal(root.right);
        return ans;
    }
}
// Time complexity => O(n)
