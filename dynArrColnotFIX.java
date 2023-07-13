public class dynArrColnotFIX {
    public static void main(String[] args) {
        int [][]dynArr = {
            {1,2,3,4,5},
            {5,6},
            {7,9,0}
        };
        for(int row = 0; row < dynArr.length; row++){
            for(int col = 0; col < dynArr[row].length; col++){
                System.out.print(dynArr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
