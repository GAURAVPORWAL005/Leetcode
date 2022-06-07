// Question => https://leetcode.com/problems/sort-array-by-parity/submissions/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
            int start = 0;
            int end = nums.length-1;
        while(start <= end){
            if(nums[start] % 2 == 0){
                start++;
            }
            else{
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        return nums;
    }
}

// Time complexity => O(n)
