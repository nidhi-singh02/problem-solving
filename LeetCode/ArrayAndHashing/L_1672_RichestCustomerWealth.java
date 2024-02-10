package LeetCode.ArrayAndHashing;


public class L_1672_RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println("result: "+maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
    public static int maximumWealth(int[][] accounts) {
        int richestCustWealth = 0;

        for (int[] account : accounts) {
            int currentCustWealth = 0;
            for (int j = 0; j < account.length; j++) {
                currentCustWealth = currentCustWealth + account[j];
            }
            richestCustWealth = Math.max(richestCustWealth, currentCustWealth);
        }

        return richestCustWealth;

    }
}
