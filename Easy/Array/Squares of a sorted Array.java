// Question => https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
// Time complexity => O(nlogn)
