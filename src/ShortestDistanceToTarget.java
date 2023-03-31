public class ShortestDistanceToTarget {
    public static int closetTarget(String[] words, String target, int startIndex) {
        int count1 = 1;
        int count2 = 1;

        if (words[startIndex].equals(target)) {
            return 0;
        }

        for (int i = startIndex + 1; ; i++) {
            if (words[i].equals(target)) {
                break;
            }
            if (i == words.length - 1) {
                i = 0;
            }
            if (i == startIndex) {
                count1 = -1;
                System.out.println("hi1");
                break;
            }
            count1 += 1;
        }
        for (int i = startIndex - 1; ; i--) {
            if (i == -1) {
                i = words.length - 1;
            }
            if (words[i].equals(target)) {
                break;
            }

            if (i == startIndex) {
                count2 = -1;
                System.out.println("hi2");
                break;
            }
            count2 += 1;
        }

        if (count1 == -1 && count2 == -1) {

            return -1;

        } else if (count1 < count2) {
            return count1;
        } else if (count1 > count2) {
            return count2;
        }

        return -1;


    }
    public static void main(String[] args) {

        String [] str = {"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"};

        System.out.print(closetTarget(str,"pbgjhutcwb",0));
    }
}
