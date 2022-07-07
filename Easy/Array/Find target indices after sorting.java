// Quesiton => https://leetcode.com/problems/find-target-indices-after-sorting-array/
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
            }
            
        }
        return list;
    }
}
// Time complexity => O(nlogn)

// Optimized Approach using two pointer
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < target){
                start++;
            }
            else if(nums[i] > target){
                end--;
            }
        }
        List<Integer> list  = new ArrayList<>();
        while(start<= end){
            list.add(start);
            start++;
        }
        return list;
    }
}
// Time complexity => O(n)
