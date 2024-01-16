package LeetCode.ArrayAndHashing;

public class L_345_ReverseVowelsOfAString {
    public static void main(String[] args){
        System.out.println("result: "+reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        // Traverse the string using two pointer technique, find the first vowel and the last vowel
        // Swap them, increase the pointers
        char[] charArray = s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start < end){
            if(!isCharVowel(charArray[start])){
                start++;
            }
            if(!isCharVowel(charArray[end])){
                end--;
            }
            if (isCharVowel(charArray[end]) && isCharVowel(charArray[start])){
                char temp = charArray[start];
                charArray[start] =  charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(charArray);
    }

    private static boolean isCharVowel(char c){
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'I', 'E', 'O', 'U' -> true;
            default -> false;
        };

    }
}
