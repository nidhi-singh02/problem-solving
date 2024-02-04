package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_1108_DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println("result: "+defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
//        return String.join("[.]", address.split("\\."));
//        return address.replace(".","[.]");
//       return address.replaceAll("\\.","[.]");

        StringBuilder s = new StringBuilder();

        for(char c : address.toCharArray()){
            s.append( c == '.' ? "[.]": c);
        }

        return String.valueOf(s);
    }
}
