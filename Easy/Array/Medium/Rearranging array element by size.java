https://leetcode.com/problems/rearrange-array-elements-by-sign/submissions/
class Solution {
    public int[] rearrangeArray(int[] nums) {
         int positive = 0;
        int negative = 1;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                ans[positive] = nums[i];
                positive += 2;
            }
            else{
                ans[negative] = nums[i];
                negative += 2;
            }
        }
        return ans;
    }
}
// time complexity => O(n)
