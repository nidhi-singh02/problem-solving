package LeetCode.BinarySearch;

import java.util.Arrays;

public class L_74_SearchA2DMatrix {


    public boolean searchMatrix(int[][] matrix, int target) {
        // Approach with log(m) + log(n) = log(m*n) time complexity giving TLE
        //     int row = matrix.length-1;
        //     int col= matrix[0].length-1;
        //     int top =0;
        //     int bot = row;

        //     while(top <= bot){
        //         int midX = top+bot/2;
        //         if(target > matrix[midX][col]){
        //               top = midX+1;
        //        }else if(target < matrix[midX][0]){
        //              bot = midX-1;
        //        }else break;
        //     }

        //    if (!(top <= bot)){
        //        return false;
        //    }

        // int myrow = top+bot/2;
        // int l = 0;
        // int r = matrix[0].length-1;

        // while(l <=r){
        //         int midY = l+r/2;
        //       if(target > matrix[myrow][midY]){
        //               l = midY+1;
        //        }else if(target < matrix[myrow][midY]){
        //              r = midY-1;
        //        }else{
        //            return true;
        //        }
        // }
        // return false;


        // Another approach
        int i = 0;
        int j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}

