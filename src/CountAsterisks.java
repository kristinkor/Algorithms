public class CountAsterisks {
    static int count = 0;

    public static int countAsterisks(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && start == end) {
                count++;
            } else {
                if (s.charAt(i) == '|') {
                    if (start == end) {
                        start++;

                    } else {
                        end++;

                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {

        String s = "*||||**||*||**|**||*|||**";

        System.out.print(countAsterisks(s)==8);
    }
}
