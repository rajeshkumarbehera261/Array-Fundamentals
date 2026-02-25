import java.util.*;
public class TwoSum {


    public static void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement)+" " +i);
            }

            map.put(nums[i], i);
    }


}
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,0,1,-1,7};
        twoSum(arr, 7);
    }
}