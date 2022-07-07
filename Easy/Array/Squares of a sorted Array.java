// Question => https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
// Brute force Approach
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


// Optimized Approach
//Using two pointer
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
// Time c omplexity => O(n)
