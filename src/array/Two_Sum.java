package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to
 * a specific target.
 You may assume that each input would have exactly one solution, and you may not use
 the same element twice.
 */
    /*
     * @param nums an array of Integer
     * @param target = nums[index1] + nums[index2]
     * @return [index1 + 1, index2 + 1] (index1 < index2)
     */

public class Two_Sum {


     int[]  twoSum(int[] number, int target){
        int[] result = new int[2];
         Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < number.length; i++){
            if(map.containsKey(target - number[i])){
                result[1] = i + 1;
                result[0] = map.get(target - number[i]);
                return result;
            }
            map.put(number[i], i + 1);
        }
        return result;
    }



    public static void main(String[] agrs){
        int[] nums = new int[]{3,2,4};
        int[] result = new Two_Sum().twoSum(nums,6);
        for (int i:result
             ) {
            System.out.print(" " + i + " ");
        }
    }
}

//比较简单的一道题,利用map的{key，value}形式

