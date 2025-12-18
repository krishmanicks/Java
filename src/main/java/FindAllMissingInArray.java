package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingInArray {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> results = new ArrayList<>();

        for (int i=0;i<nums.length;i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        for (int i=0;i<nums.length;i++) {
            if (nums[i] > 0) {
                results.add(i+1);
            }
        }

        return results;

    }
}
