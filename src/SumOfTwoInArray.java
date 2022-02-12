//Given a list of numbers arr and a number k, return whether ant two numbers from the list arr add up to k

import java.security.cert.TrustAnchor;
import java.util.Arrays;
import java.util.HashSet;

public class SumOfTwoInArray {
    public static void main(String[] args) {
        int k = 17;
        int[] arr = {1, 3, 5, 14, 18, 32};
        int n = arr.length;
        boolean flag = false;
        //First Method O(n)
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                if (arr[i] + arr[j] == k) {
//                    int a = arr[i];
//                    int b = arr[j];
//                    System.out.println(a + " " + b);
//                    flag = true;
//                    break;
//                }
//                if (flag) {
//                    break;
//                }
//            }
//        }

        // Second Method O(log(n))
//        Arrays.sort(arr);
//        int left = 0;
//        int right = n - 1;
//        while (left < right) {
//            int sum = arr[left] + arr[right];
//            if ((sum) < k) {
//                left += 1;
//            }
//            else if (sum>k){
//                right -= 1;
//            }
//            else{
//                System.out.println(arr[left] + " " + arr[right]);
//                break;
//            }
//        }
        //Third method
        HashSet<Integer> set = new HashSet();
        for (int el :
                arr) {
            if (set.contains(k - el)) {
                flag = true;
                int a = k - el, b = el;
                System.out.println(a + " " + b);
                break;
            } else {
                set.add(el);
            }

        }


    }
}
