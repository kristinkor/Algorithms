import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

    //85ms
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }
            }
        }

        return new int[]{};
    }

    // 2ms
    public static int[] twoSum2(int[] nums, int target) {
        Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
        int start;

        for(int i = 0;i<nums.length;i++){
            if (hm.containsKey(target - nums[i])){
                start = hm.get(target - nums[i]);
                return new int[] {start, i};
            }
            else {
                hm.put(nums[i],i);
            }
        }


        return new int[] {};
    }


    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 11};
        twoSum1(arr, 10);
        twoSum2(arr, 10);

    }
}