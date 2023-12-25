import java.util.HashMap;
import java.util.Map;

class L_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // First approach: Sort both the strings
        // Then check if they are equal, if same they are anagram, return true
        // Else return false
        // Time Complexity - O(n log n + m log n)
        // Space complexity - O(n+m) for storing in character array

        if (s.length() != t.length()){
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        //     Arrays.sort(sChars);
        //     Arrays.sort(tChars);
        // return Arrays.equals(sChars,tChars);

        // Second approach: Use HashMap to store the elements and their occurrences
        // Time Complexity - O(n+m)
        // Space Complexity - O(n+m)
        Map<Character,Integer> strVisited = new HashMap<>();
        Map<Character,Integer> strVisitedT = new HashMap<>();

        for(Character elem:sChars){
            strVisited.put(elem,strVisited.getOrDefault(elem,0)+1);
        }

        for(Character elem:tChars){
            strVisitedT.put(elem,strVisitedT.getOrDefault(elem,0)+1);
        }

        return  strVisited.equals(strVisitedT);
    }
}