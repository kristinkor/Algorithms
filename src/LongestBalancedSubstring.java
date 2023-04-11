public class LongestBalancedSubstring {
    public static int findTheLongestBalancedSubstring(String s) {
        int max = 0;
        int temp = 0;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                index1 = i;
                index2 = i + 1;
                temp = find_longest(index1, index2, s);
                System.out.println(temp);
            }
            if (max < temp) {
                max = temp;
            }
        }

        if (index1 == 0 && index2 == 0) {
            return 0;
        }

        return max;

    }

    public static int find_longest(int index1, int index2, String s) {
        int count0 = 0;
        int count1 = 0;
        for (int i = index2; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                break;
            } else {
                count1++;
            }
        }
        for (int i = index1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                break;
            } else {
                count0++;
            }
        }
        return Math.min(count0, count1) * 2;

    }

    public static void main(String[] args) {
        String s = "01000111";
        System.out.println(findTheLongestBalancedSubstring(s) == 6);

    }
}
