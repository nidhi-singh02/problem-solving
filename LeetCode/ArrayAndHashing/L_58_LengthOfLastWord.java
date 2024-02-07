package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_58_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println("result: "+lengthOfLastWord("   fly me   to   the moon  "));
    }

    private static int lengthOfLastWord(String s) {
        String[] strWithoutSpaces = s.split("\\s");
        System.out.println(Arrays.toString(strWithoutSpaces));
        return strWithoutSpaces[strWithoutSpaces.length - 1].length();
    }
}
