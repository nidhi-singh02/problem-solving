package LeetCode.BinarySearch;

public class L_374_GuessNumberHigherOrLower {
    public static void main(String[] args) {
        System.out.println("result: "+guessNumber(10));
    }
    public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        int pick = 0;
        while (left <= right) {
            // pick = (left+right) / 2;
            pick = left + ((right - left) / 2);
            if (guess(pick) == 0) {
                break;
            } else if (guess(pick) == -1) {
                // my guess is higher than picked number
                right = pick - 1;
            } else {
                left = pick + 1;
            }
        }

        return pick;
    }

    private static int guess(int pick) {
        return 0;
    }
}
