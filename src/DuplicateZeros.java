import java.util.ArrayList;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp.add(arr[i]);
                temp.add(0);
            } else {
                temp.add(arr[i]);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp.get(j);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 0, 6, 8, 0, 6, 0};
        duplicateZeros(arr);
    }
}