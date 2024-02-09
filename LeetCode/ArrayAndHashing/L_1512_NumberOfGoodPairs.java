package LeetCode.ArrayAndHashing;

public class L_1512_NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println("result is :"+numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    public static int numIdenticalPairs(int[] nums) {
        int numberOfGoodPairs = 0;
        for(int i=0; i < nums.length;i++){
            for(int j=i+1; j < nums.length;j++){
                if(nums[i] == nums[j]){
                    numberOfGoodPairs++;
                    System.out.println("pairs"+i+ "j "+j);
                }
            }
        }

        return numberOfGoodPairs;
    }
}
