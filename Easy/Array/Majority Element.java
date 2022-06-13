// Question => https://leetcode.com/problems/majority-element/submissions/

// Brute fore Approach
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

// Time complexity => O(logn)

// Optimized Approach
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                element = nums[i];
            }
            if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
            return element;
    }
}

// Time complexity => O(n)
