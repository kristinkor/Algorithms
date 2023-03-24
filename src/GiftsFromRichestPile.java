import java.util.Arrays;

public class GiftsFromRichestPile {
    public static long pickGifts(int[] gifts, int k) {
        double result = 0;
        Arrays.sort(gifts);
        //sort
        for (int i = 0;i< k; i++){

            //last elem square root
            result = Math.sqrt(gifts[gifts.length-1]);
            gifts[gifts.length-1] =  (int)result;
            System.out.println(gifts[gifts.length-1]);
            Arrays.sort(gifts);
        }
        long sum =0;
        for (int j = 0; j < gifts.length; j++){
            System.out.println(gifts[j]);
            sum += gifts[j];
        }
        return sum;

    }
    public static void main(String[] args) {

        int[] arr = {25,64,9,4,100};

        System.out.print(pickGifts(arr,4));
    }
}
