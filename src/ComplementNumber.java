public class ComplementNumber {
    public static int findComplement(int num) {
        int i = 0;
        int j = 0;

        while (i < num) {
            i += Math.pow(2, j);
            j++;
        }

        return i - num;
    }


    public static void main(String[] args) {
        if(findComplement(5)==(2)){
            System.out.println("Win-win");
        }
    }

}
