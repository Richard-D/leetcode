package array;

/**
 * Created by Administrator on 2017/8/21.
 */
public class maxSubArray {

    public int maxSubArray(int[] A) {
        int maxSoFar = A[0], maxEndingHere = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] agrs) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int j = new maxSubArray().maxSubArray(nums);
        System.out.print(" " + j + " ");
    }
}
