import java.util.HashMap;
import java.util.Map;

public class MinNumberOfRabbits {

    // Function to find the minimum
    // number of rabbits in the forest
    public static int minNumberOfRabbits(int[] answers) {
        // Initialize map
        Map<Integer, Integer> map
                = new HashMap<Integer, Integer>();

        // Traverse array and map arr[i]
        // to the number of occurrences
        for (int a : answers) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // Initialize count as 0;
        int count = 0;

        // Find the number groups and
        // no. of rabbits in each group
        for (int a : map.keySet()) {
            int x = a;
            int y = map.get(a);

            // Find number of groups and
            // multiply them with number
            // of rabbits in each group
            if (y % (x + 1) == 0) {
                count = count + (y / (x + 1)) * (x + 1);
            } else
                count
                        = count + ((y / (x + 1)) + 1) * (x + 1);
        }

        return count;
    }


    public static void main(String[] args) {
        int[] arr = {10, 10, 10};


        // Function Call
        System.out.println(minNumberOfRabbits(arr));
    }

}
