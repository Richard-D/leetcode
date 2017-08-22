package array;

/**
 * Created by Administrator on 2017/8/21.
 */
public class searchInsert {
    public int searchInsert(int[] A, int target){
        int low = 0, high = A.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid - 1;
            else if(A[mid] < target) low = mid + 1;
        }
        return low;
    }

    public static void main(String[] agrs) {
        int[] nums = new int[]{1,2,6};
        int m = new searchInsert().searchInsert(nums, 4);
        System.out.print(" " + m + " ");
    }
}
