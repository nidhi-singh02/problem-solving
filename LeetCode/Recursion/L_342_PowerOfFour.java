package LeetCode.Recursion;

public class L_342_PowerOfFour {
    public boolean isPowerOfFour(int n) {
            //    for(int i=0; i <= n/2;i++){
            //       if (Math.pow(4,i) == n){
            //           return true;
            //       }
            //    }

            //    while(n > 1){
            //        if (n%4 !=0){
            //            return false;
            //        }
            //        n = n/4;
            //    }

            //      if(n == 1){
            //         return true;
            //     }else{
            //          return false;
            //     }

            if(n == 1){
                return true;
            }else if(n==0){
                return false;
            }
            if (n%4 !=0){
                return false;
            }

            return isPowerOfFour(n/4);
        }
}

