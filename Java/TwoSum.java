import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static List<Integer> twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return Arrays.asList(map.get(target - nums[i]), i);
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(twoSum(nums, 10));
    }
}
