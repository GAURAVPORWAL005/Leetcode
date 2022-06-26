// Question => https://leetcode.com/problems/single-element-in-a-sorted-array/
// Brute force approach using Bit Manipulation
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum ^ nums[i];
        }
        return sum;
    }
}
// Time complexity => O(n)

// Better Approach using loops
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<=nums.length-1;i = i+2){
             if(i == nums.length-1){
                return nums[i];
            }
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}
// Time complexity => O(n)

// Optimized Approach
/* XOR with any odd integer let's say 3 gives you 2.
3 -> 11
1 -> 01
XOR of 3 and 1 -> 10

XOR with any even integer let's say 4 gives you 5.
4 -> 100
1 - > 001
XOR of 4 and 1 -> 101*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-2;
        while(start <= end){
          int mid = start + (end - start) / 2;
            if(nums[mid] == nums[mid ^ 1]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
// Time complexity => O(logn)
