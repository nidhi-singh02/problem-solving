package LeetCode.ArrayAndHashing;

public class L_1929_ConcatenationOfArrays {
    public static void main(String args[]) {
        System.out.println("result: "+getConcatenation(new int[]{0,0,1,1,2,3,4}));

    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = nums.length;

        for (int j = 0; j < nums.length; j++) {
            ans[j] = nums[j];

        }
          for (int j = 0; j < nums.length; j++) {
            ans[i] = nums[j];
            i++;

        }
        return ans;
    }
}