class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Time complexity : O(M + N)
        // int rows = matrix.length;
        // int columns = matrix[0].length;

        // for(int i = 0 ; i < rows ; i++){
        //     if(target >= matrix[i][0] && target <= matrix[i][columns - 1]){
        //         for(int j = 0 ; j < columns ; j++){
        //             if(matrix[i][j] == target){
        //                 return true;
        //             }
        //         }

        //         return false;
        //     }
        // }

        // return false;

        //Flattening technique

        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = rows * columns - 1;

        while(low <= high){
            int mid = (low + high)/2;

            int val = matrix[mid/columns][mid % columns];

            if(target > val){
                low = mid + 1;
            }else if(target < val){
                high = mid - 1;
            }else{
                return true;
            }
        }

        return false;
    }
}
