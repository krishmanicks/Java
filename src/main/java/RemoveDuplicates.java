package src.main.java;

public class RemoveDuplicates {

    public static void main(String[] args) {
//        int[] nums = {0,1,1};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {


        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }

        int min = 1;

        for (int i=1;i<nums.length;i++) {
            System.out.println(nums[i-1] + "  " + nums[i]);
            if (nums[i-1] != nums[i]) {
                min++;
            }
        }
        return min;
    }
}
