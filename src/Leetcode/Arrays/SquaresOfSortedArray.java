package Leetcode.Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String... args){
        int[] nums = new int[] {-4,-1,0,3,10};
        int[] output = solution(nums);
        for(int item: output) {
            System.out.println(item);
        }
    }
    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int square = nums[i] * nums[i];
            result[i] = square;
        }

        Arrays.sort(result);
        return result;
    }
}
