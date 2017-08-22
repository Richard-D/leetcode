package array;

/**
 * Created by Administrator on 2017/8/21.
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int m = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] != elem) {
                A[m] = A[i];
                System.out.print(A[m]);
                m++;
            }
        }

        return m;
    }

    public static void main(String[] agrs) {
        int[] nums = new int[]{1,1,2,2,3,3,};
        int m = new RemoveElement().removeElement(nums, 2);
        System.out.print(" " + m + " ");
    }
}
