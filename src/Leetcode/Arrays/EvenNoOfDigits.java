package Leetcode.Arrays;

public class EvenNoOfDigits {
    public static void main(String... args){
        int[] nums = new int[] {12,345,2,6,7896};
        int output = solution(nums);
        System.out.println(output);
    }

    public static int solution(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(String.valueOf(nums[i]).length() % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
