// Question => https://leetcode.com/problems/binary-tree-paths/
class Solution {
    List<String> list = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
         
        binary(root,"");
        return list;
    }
    public void binary(TreeNode root, String str){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(str + root.val);
        }
        binary(root.left, str+root.val+"->");
        binary(root.right, str+root.val+"->");
    }
}
// Time complexity => O(n)
