package LeetCode.ArrayAndHashing;

public class L_724_FindPivotIndex {
    public static void main(String[] args){
        System.out.println("result: "+pivotIndex(new int[]{1,2,3}));
    }

    public static int pivotIndex(int[] nums) {
        // Traverse the array and check for each element as the pivot
        // Calculate leftSum and rightSum, if not equal, keep moving
        // If equal, return the index
        // Brute Force approach
//        int pivotIndex = -1;
//        int leftSum = 0;
//
//        for(int i=0; i< nums.length;i++){
//
//            int rightSum = 0;
//           if(i > 0){
//               leftSum = leftSum + nums[i-1];
//           }
//
//           for(int j=i+1;j< nums.length;j++){
//               rightSum = rightSum + nums[j];
//           }
//
//           if(leftSum == rightSum){
//               pivotIndex =i;
//               break;
//           }
//        }
//
//        return pivotIndex;

        // Second approach

        int pivotIndex =-1;
        int leftSum = 0;
        int rightSum =0;

        for(int n:nums){
            rightSum = rightSum +n;
        }

        for(int i=0; i < nums.length;i++){
            if (i > 0){
                leftSum += nums[i-1];
            }
            rightSum = rightSum - nums[i];
            if(leftSum == rightSum){
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }
}
