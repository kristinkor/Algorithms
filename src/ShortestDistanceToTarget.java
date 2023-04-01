public class ShortestDistanceToTarget {
    public static int closetTarget(String[] words, String target, int startIndex) {
     int left= 0; int right=0;
     int l = words.length;
        for(int i = startIndex; true; i = (i+1) % l) {
            System.out.println(i);
            if(right == l) {
                return -1;
            }
            if(words[i].equals(target)) {
                break;
            } else {
                right++;
            }
        }
        System.out.println("fff");
        for(int i = startIndex; true; i = (i-1+l) % l) {
            System.out.println(i);
            if(words[i].equals(target)) {
                break;
            } else {
                left++;
            }
        }

        return Math.min(right, left);
    }
    public static void main(String[] args) {

        String [] str = {"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"};

        System.out.print(closetTarget(str,"zemkwvqrww",0));
    }
}
