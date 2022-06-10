// Question  => https://leetcode.com/problems/find-the-middle-index-in-array/submissions/

class Solution {
    public int findMiddleIndex(int[] nums) {
        
        // Calculating sum
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        // subtracting sum from every element
        int sum1 = 0;
        for(int i=0;i<nums.length;i++){
            sum -= nums[i];
            if(sum == sum1){
                return i;
            }
            // returning the index
            sum1 += nums[i];
        }
        return -1;
    }
}

// Time Complexity => o(n)
