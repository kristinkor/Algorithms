import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String res = "";
        if (strs.length == 0) return "";
        else{
            Arrays.sort(strs);
            for (String s:
                 strs) {
                System.out.println(s);
            }
            for(int i = 0; i < strs[0].length(); i++){
                System.out.println(strs[0].charAt(i));
                System.out.println(strs[strs.length - 1].charAt(i));
                if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                    res  += String.valueOf(strs[0].charAt(i));
                }
                else {
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        String[] arr  = {"flower","flow","flight", "vgchgvjkn", "vccfffgh", "flll"};
        System.out.print(longestCommonPrefix(arr));
    }
}
