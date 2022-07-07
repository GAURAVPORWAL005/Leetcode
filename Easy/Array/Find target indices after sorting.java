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
