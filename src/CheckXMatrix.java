public class CheckXMatrix {
    public static boolean checkXMatrix(int[][] grid) {
        for(int i =0; i< grid.length;i ++){
            for(int j = 0; j <grid.length; j++){

                //checking diagonals for zeros
                if((i==j) || ((i+j)==(grid.length - 1))){
                    if(grid[i][j]==0){
                        return false;
                    }
                }
                //else check the rest for non-zeros
                else if(grid[i][j]!=0){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

        int[][] arr = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};

        System.out.print(checkXMatrix(arr));
    }
}
