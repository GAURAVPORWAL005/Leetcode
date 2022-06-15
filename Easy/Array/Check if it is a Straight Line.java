// Question => https://leetcode.com/problems/check-if-it-is-a-straight-line/
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n == 2){
            return true;
        }
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        for(int i=0;i<n-1;i++){
            if((dy * (coordinates[i+1][0] - coordinates[i][0])) != (dx *(coordinates[i+1][1] - coordinates[i][1]))){
                return false;
            }
        }
        return true;
    }
}
// Time Complexity => O(n)
