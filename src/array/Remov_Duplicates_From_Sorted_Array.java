package array;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

 */
public class Remov_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums){
        int i = nums.length > 0 ? 1 : 0;
        for (int n:nums
             ) {
            if (n>nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
    //官方解决方案
    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] agrs){
        int[] nums = new int[]{1,1,2,2,3};
        //int i = new Remov_Duplicates_From_Sorted_Array().removeDuplicates(nums);
        int j = new Remov_Duplicates_From_Sorted_Array().removeDuplicates2(nums);
            System.out.print(" "  + j + " ");
        }
    }



