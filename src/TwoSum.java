import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> unsortedMap
                = new HashMap<Integer, Integer>();
        int[] arr = new int[2];


        int sum = 0;
        int j = 1;
        for (int i = 0; i < nums.length; ) {
            System.out.println(nums[i]);
            if (nums[i] + nums[j] == target) {
                arr[0] = i;
                arr[1] = j;
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                System.out.println(target);
                return arr;
            }

            if (j == nums.length - 1) {
                i++;
                j = i + 1;

            } else {
                j++;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 11};
        System.out.print(twoSum(arr, 10));
    }
}