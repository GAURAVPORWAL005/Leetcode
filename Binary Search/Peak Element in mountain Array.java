// Question => https://leetcode.com/problems/peak-index-in-a-mountain-array/
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max = -1;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}

// Time complexity => O(n)

// Optimized Approach
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            // We are in the decreasing part but check left side
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            // We are in the ascending part
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
// Time complexity => O(logn)
