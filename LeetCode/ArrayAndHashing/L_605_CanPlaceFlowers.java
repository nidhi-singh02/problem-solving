package LeetCode.ArrayAndHashing;

public class L_605_CanPlaceFlowers {
    public static void main(String[] args){
        System.out.println("result: "+canPlaceFlowers(new int[]{0,0,0,0,0,1,0,0},0));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // First approach: Iterate over the array and check if element is 1, if yes move by two steps
        // Then if the element is 0, check the element next to it, if it is 0, we can insert the new plant
        // If we have reached the end of the array and the value is 0, we can insert plant
        int count = 0;
        if(n == 0){
            return true;
        }
        for(int i=0;i < flowerbed.length;){
            if(flowerbed[i] == 1){
                i=i+2;
            }else if(flowerbed[i] == 0 && i == flowerbed.length-1){
                flowerbed[i] = 1;
                count++;
                i=i+2;
            }else if(flowerbed[i] == 0 && flowerbed[i+1]== 0){
                flowerbed[i] = 1;
                count++;
                i=i+2;
            }else{
                i++;
            }
            if(n == count){
                return true;
            }
        }
        return false;
    }
}
