import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] nums3 = {3,3};
        int target3 = 6;

        System.out.println("Test Case 1:" + Arrays.toString(solution(nums1, target1)));
        System.out.println("Test Case 2:" + Arrays.toString(solution(nums2, target2)));
        System.out.println("Test Case 3:" + Arrays.toString(solution(nums3, target3)));
    }

    private static int[] solution(int[] nums, int target) {

        Map<Integer, Integer> contents = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference = Math.abs(target - nums[i]);
            if(contents.containsKey(difference)){
                return new int[] {contents.get(difference), i};
            }
            contents.put(nums[i], i);
        }
        return new int[]{ };
    }
}