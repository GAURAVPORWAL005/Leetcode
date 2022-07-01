// Question => https://leetcode.com/problems/binary-tree-right-side-view/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root,list,0);
        return list;
    }
    public void rightView(TreeNode curr, List<Integer> list, int depth){
        if(curr == null){
            return;
        }
        if(depth == list.size()){
            list.add(curr.val);
        }
        rightView(curr.right,list,depth+1);
        rightView(curr.left,list,depth+1);
    }
}
// Time complexity => O(n)
