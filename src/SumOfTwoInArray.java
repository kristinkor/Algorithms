//Given a list of numbers arr and a number k, return whether ant two numbers from the list arr add up to k

import java.util.Arrays;
import java.util.HashSet;

public class SumOfTwoInArray {
    public static void main(String[] args) {
        int k = 17;
        int[] arr = {1, 4, 78, 23425, 4, 66, 234, 6, 77, 555, 3434, 686, 134, 3, 5, 14, 18, 32};
        int n = arr.length;
        boolean result = false;

        method1(arr, k, n, result);
        method2(arr, k, n);
        method3(arr, k);
    }

    //First Method O(n^2)
    public static void method1(int[] arr, int k, int n, boolean result) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] + arr[j] == k) {
                    int a = arr[i];
                    int b = arr[j];
                    System.out.println(a + " " + b);
                    result = true;
                    break;
                }
                if (result) {
                    break;
                }
            }
        }
    }

    // Second Method O(log(n))
    public static void method2(int[] arr, int k, int n) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if ((sum) < k) {
                left += 1;
            } else if (sum > k) {
                right -= 1;
            } else {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            }
        }
    }

    //Third Method O(n) The best solution
    public static void method3(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int el :
                arr) {
            if (set.contains(k - el)) {
                int a = k - el;
                System.out.println(a + " " + el);
                break;
            } else {
                set.add(el);
            }

        }
    }
}
