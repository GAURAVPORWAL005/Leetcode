// Question => https://leetcode.com/problems/merge-sorted-array/submissions/
class Solution { public void merge(int[] nums1, int m, int[] nums2, int n){
  for(int i=0;i<nums2.length;i++){ 
    nums1[m] = nums2[i];
    m++; 
}
Arrays.sort(nums1);
   }
}

// Time complexity => O(n)
