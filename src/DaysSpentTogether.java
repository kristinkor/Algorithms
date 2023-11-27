import java.util.HashSet;
import java.util.Set;

class DaysSpentTogether {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        String result = arriveAlice + "-" + leaveAlice + "-" + arriveBob + "-" + leaveBob;
        String[] arr = result.split("-");
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int start1 = Integer.parseInt(arr[0]);
        int end1 = Integer.parseInt(arr[2]);
        int start2 = Integer.parseInt(arr[4]);
        int end2 = Integer.parseInt(arr[6]);


        int start1Day = getDayOfYear(start1, Integer.parseInt(arr[1]), days);
        int end1Day = getDayOfYear(end1, Integer.parseInt(arr[3]), days);
        int start2Day = getDayOfYear(start2, Integer.parseInt(arr[5]), days);
        int end2Day = getDayOfYear(end2, Integer.parseInt(arr[7]), days);

        int startDateMonth = Math.max(start1, start2);
        int startDateDay = Math.max(start1Day, start2Day);
        int endDateMonth = Math.min(end1, end2);
        int endDateDay = Math.min(end1Day, end2Day);

        if (endDateMonth < startDateMonth || (endDateMonth == startDateMonth && endDateDay < startDateDay)) {
            return 0;
        }
        System.out.println(start1Day);
        System.out.println(end1Day);
        System.out.println(start2Day);
        System.out.println(end2Day);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        while (start1Day <= end1Day) {
            set1.add(start1Day);
            start1Day++;
        }
        while (start2Day <= end2Day) {
            set2.add(start2Day);
            start2Day++;
        }


        return countIntersection(set1, set2);
    }

    public static int countIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        return intersection.size();
    }

    public int getDayOfYear(int month, int day, int[] days) {
        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += days[i];
        }
        return dayOfYear;
    }
}