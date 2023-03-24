import java.util.Arrays;

public class LargestPositiveWithNegative {
    public static int findMaxK(int[] nums) {
        // a+b =0
        Arrays.sort(nums);
        //-3 -1 2 3
        int sum;
        int j = 0;
        int temp = nums[j];
        for (int i = 1; i < nums.length; ){
            sum = temp + nums[i];
            //System.out.println(sum);
            if(sum == 0){
                return nums[i];
            }
            if(nums[i]== nums[nums.length-1]){
                j+=1;

                temp = nums[j];
                i= j+1;
            }
            else{
                i++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {22,34,2,44,-8,49,-5,22,46,39,-23,-15,27,48,-37,10,22,-45,13,-2};

        System.out.print(findMaxK(arr));
    }
}
