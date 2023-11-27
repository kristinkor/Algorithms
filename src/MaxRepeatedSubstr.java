public class MaxRepeatedSubstr {
    public static int maxRepeating(String sequence, String word) {
        int i = 0;
        int max = 0;
        while (i <= sequence.length() - word.length()) {
            int count = 0;
            while (i <= sequence.length() - word.length() && sequence.startsWith(word, i)) {
                count++;
                i += word.length();
            }
            max = Math.max(max, count);
            if (count == 0) {
                i++;
            }
        }
        return max;


    }

    public static void main(String[] args) {
        String str1 = "ababc";
        String str2 = "ab";


        // Function Call
        System.out.println(maxRepeating(str1, str2));
    }
}
