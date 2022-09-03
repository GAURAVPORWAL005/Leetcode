https://leetcode.com/problems/find-all-duplicates-in-an-array/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            if(count == 2){
                list.add(nums[i]);
                count = 1;
            }
        }
        return list;
    }
}
// time complexity => O(nlogn)
