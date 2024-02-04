package LeetCode.ArrayAndHashing;

public class L_2011_FindValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println("result: "+finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
    public static int finalValueAfterOperations(String[] operations) {
      int result = 0;
      
      for(String s:operations){
          if(s.contains("--")){
              result--;
          }else{
              result++;
          }
      }
      
      return result;
    }
}