package LeetCode.ArrayAndHashing;

public class L_392_IsSubsequence {
    public static void main(String[] args) {
        System.out.println("result: "+isSubsequence("abc","ahbgdcd"));

    }

    public static boolean isSubsequence(String s, String t) {
        // Traverse the string, if same char is found in both, increment and go further
        // If the char in s does not exist in t, move forward, keep moving until found
        // If we reach end of t, and not end of s, means it is not subsequence
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int posAtS = 0;

        for(int i=0; i < t.length();i++){
            if(posAtS == s.length()){
                return true;
            }
            if(sChar[posAtS] == tChar[i]){
                posAtS++;
            }
        }
        return posAtS == s.length();
    }
}
