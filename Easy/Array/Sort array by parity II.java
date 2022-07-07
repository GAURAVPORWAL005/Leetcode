// Question => https://leetcode.com/problems/sort-array-by-parity-ii/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int index = nums.length-1;
        while(start <= end){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                ans[index] = nums[start] * nums[start];
                start++;
            }
            else{
                ans[index] = nums[end] * nums[end];
                end--;
            }
            index--;
        }
        return ans;
    }
}
// Time complexity => O(n)
