import java.sql.Array;

public class CalculateDigitSumOfString {
    public static String digitSum(String s, int k) {
        //go 1 by 1
        // add 1+2+3

        while (s.length() > k) {
            String res = "";
            int sum = 0;
            int x = 0;

            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';

                x++;
                if (x == k) {
                    res += sum;
                    sum = 0;
                    x = 0;

                }
                System.out.println(res);

            }
            if (x > 0) {
                res = res + String.valueOf(sum);
            }
            s = res;

        }
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        if(digitSum(s, k).equals("135")){
            System.out.println("Win-win");
        }
    }
}
