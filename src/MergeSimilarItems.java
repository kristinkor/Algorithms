import java.util.*;

public class MergeSimilarItems {

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new TreeMap<>();

        addValuesToMap(items1, map);
        addValuesToMap(items2, map);

        List<List<Integer>> result = new ArrayList<>();

        for (var e : map.entrySet()) {

            result.add(Arrays.asList(e.getKey(), e.getValue()));
        }

        return result;

    }

    public static void addValuesToMap(int[][] items, Map<Integer, Integer> map) {

        for (int[] j : items) {

            int key = j[0];
            int value = j[1];

            map.put(key, map.getOrDefault(key, 0) + value);
        }
    }

    public static void main(String[] args) {
        int[][] items1 = {
                {3, 4},
                {1, 2},
                {5, 6},
                {2, 1}
        };
        int[][] items2 = {
                {2, 4},
                {1, 2},
                {7, 6},
                {1, 1}
        };
        System.out.println(mergeSimilarItems(items1, items2));
    }
}
