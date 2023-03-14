import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int j : arr) {
            if (map.get(j) == null) {
                map.put(j, 1);
            }
            else {
                map.put(j, map.get(j) + 1);
            }

        }

        Set<Integer> uniqueValues = new HashSet<Integer>(map.values());

        return uniqueValues.size() == map.size();

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.print(uniqueOccurrences(arr));
    }
}
