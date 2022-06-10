// Question => https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int index = 0;
            int min = matrix[i][0];
            
            // checking ther minimum in the row
            
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    index = j;
                }
            }
            
            // checking the maximum in the column
            
            boolean isTrue = true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][index] > min){
                    isTrue = false;
                }
            }
            if(isTrue == true){
                list.add(matrix[i][index]);
            }
        }
        return list;
    }
}

// Tiem complexity => O(n^2)
