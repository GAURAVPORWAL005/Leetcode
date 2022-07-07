
// Brute force Approach using two loops
class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]-1) * (nums[j]-1) > max){
                    max = (nums[i]-1) * (nums[j]-1);
                }
            }
        }
        return max;
    }
}
// TIme  complexity => O(n2)

// Better Approach using soritng
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
      int max = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return max;
    }
}
// Time complexity => O(logn)


// Optimized Approach find max and sec max
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                sec_max = max;
                max = nums[i];
                
            }
            else if(nums[i] >= sec_max){
                sec_max = nums[i];
            }
        }
        return ((max-1) * (sec_max-1));
    }
}
// Time complexity => O(n)
