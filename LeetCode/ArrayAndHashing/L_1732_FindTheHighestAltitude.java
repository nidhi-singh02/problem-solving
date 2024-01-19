package LeetCode.ArrayAndHashing;

public class L_1732_FindTheHighestAltitude {
    public static void main(String[] args){
        System.out.println("result: "+largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
    public static int largestAltitude(int[] gain) {
        // Traverse the array, create new array for altitudes
        // In new array, for every element i, add it to i+1 in gain array
        // From the altitudes array, pick the max element

//        int[] altitudes = new int[gain.length+1];
//        altitudes[0] = 0;
//        int j=1;
//        for(int i=0;i < gain.length;i++){
//            altitudes[j] = altitudes[j-1] + gain[i];
//            j++;
//        }
//        int largestAlt = Integer.MIN_VALUE;
//        for(int al: altitudes){
//            if(al > largestAlt){
//                largestAlt = al;
//            }
//        }
//        return largestAlt;

        // Second approach using Hint
        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        int sum = 0;
        for(int i=0;i < gain.length;i++){
          sum = sum + gain[i];
        }

        altitudes[gain.length] = sum;
        for(int j=gain.length-1; j > 0; j--){
            altitudes[j] = sum - gain[j];
            sum = sum - gain[j];
        }
        altitudes[0] = 0;
        int largestAlt = Integer.MIN_VALUE;
        for(int al: altitudes){
            if(al > largestAlt){
                largestAlt = al;
            }
        }
        return largestAlt;

    }
}
