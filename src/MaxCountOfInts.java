public class MaxCountOfInts {
//binary Search solution
//Time complexity: O(log(n))
//Space complexity: O(1)

    public static int maximumCount1(int[] nums) {


        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return nums.length;
        }

        int largestNegativeIndex = 0;

        if (nums[0] != 0) {
            int low = 0;
            int high = nums.length - 1;
            while (high - low > 1) {
                int middleIndex = (low + (high - low)) / 2;

                if (nums[middleIndex] < 0) {
                    low = middleIndex;
                } else {
                    high = middleIndex - 1;
                }
            }
            if (nums[high] < 0) {
                largestNegativeIndex = high + 1;
            } else {
                largestNegativeIndex = low + 1;
            }
        }


        int positiveCount = 0;
        if (nums[nums.length - 1] != 0) {
            int low = largestNegativeIndex;
            int high = nums.length - 1;

            while (high - low > 1) {
                int mid = low + (high - low) / 2;

                if (nums[mid] > 0) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            if (nums[low] > 0) {
                positiveCount = nums.length - low;
            } else {
                positiveCount = nums.length - high;
            }
        }

        return Math.max(positiveCount, largestNegativeIndex);
    }

//linear Search solution
//Time complexity: O(n)
//Space complexity: O(1)
    public static int maximumCount(int[] nums) {

        int lastNegativeIndex = -1;
        int countedLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                countedLength += 1;
            }
            if (nums[i] < 0) {
                lastNegativeIndex = i;
            }
        }

        if (lastNegativeIndex == -1 || lastNegativeIndex == countedLength - 1) {
            return countedLength;
        } else {
            return Math.max(lastNegativeIndex + 1, countedLength - lastNegativeIndex - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 5, 20, 66, 1314};

        System.out.print(maximumCount1(arr));
    }
}
