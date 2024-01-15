package LeetCode.ArrayAndHashing;

public class L_1071_GreatestCommonDivisorOfStrings {
    public static void main(String[] args){
        System.out.println("result: "+gcdOfStrings("ABCDABCD","ABCD"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String result = "";
        int len2 = str2.length();
        int len1  = str1.length();
        int currLen2 = len2;

        while(currLen2 > 0){
            if(len1 % currLen2 == 0 && len2 % currLen2 == 0){
                int OccurencesIn2 = len2/currLen2;
                int OccurencesIn1 = len1/currLen2;
                String desiredStr  = str2.substring(0,currLen2);
                String ans1="";
                String ans2="";

                for (int i=0;i<OccurencesIn2;i++){
                    ans2= ans2+ desiredStr;

                }
                for (int i=0;i<OccurencesIn1;i++){
                    ans1 = ans1+ desiredStr;

                }

                if(str2.equals(ans2) && str1.equals(ans1)){
                    result = desiredStr;
                    break;
                }


            }
            currLen2--;
        }

        return result;
    }

}
