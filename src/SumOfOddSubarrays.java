public class SumOfOddSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {

        int coef = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            coef = (i + 1) * (arr.length - i);

            if (coef % 2 != 0) {
                coef = coef / 2 + 1;
            } else {
                coef = coef / 2;
            }
            result += arr[i] * coef;
            System.out.println(result);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        // SOLUTION
        // Calculate the number of times each item from the array appears in subarrays
        // Array Index:   1   2   3   4   5
        // Occurrences:   3   4   5   4   3

        // The coefficient is obtained by multiplying the current index + 1 by the length of the array minus the current index and then dividing it by 2.
        // If the coefficient is odd, add +1.
        // Start Index:   1   2   3   4   5
        // End Index:     4   4   3   2   1
        // Occurrences:   3   4   5   4   3

        // Multiply the current item by the coefficient and add to the result

        System.out.println(sumOddLengthSubarrays(arr));
    }
}
