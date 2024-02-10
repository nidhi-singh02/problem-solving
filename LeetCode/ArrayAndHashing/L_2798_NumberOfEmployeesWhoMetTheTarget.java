package LeetCode.ArrayAndHashing;

public class L_2798_NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        System.out.println("result: "+numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4},2));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int noOfEmployeesWorkedForTarget = 0;

        for(int hour:hours){
            if(hour  >= target){
                noOfEmployeesWorkedForTarget++;
            }
        }

        return noOfEmployeesWorkedForTarget;
    }
}
