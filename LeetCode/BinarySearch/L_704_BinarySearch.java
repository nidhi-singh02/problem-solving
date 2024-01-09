package LeetCode.BinarySearch;

public class L_704_BinarySearch {

    public static void main(String[] args){
        int[] input = {-1,0,3,4,5,9,18};
      int  result =  search(input,9);
      System.out.println("result: "+result);
    }
    public static int search(int[] nums, int target) {
        // For log n complexity, don't traverse the array completely

        int start=0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (end + start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
}