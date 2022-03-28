public class Matrix {
    public static void main(String[] args) {
    int x, y; int diagonalSum=0;
    int matrix [][] = new int[10][10];

  for (x=0; x<10 ; x++){
      for (y=0; y<10 ; y++){
         if (x == y && x>0){
             matrix [x][y] = x;
             diagonalSum +=x;
         }
         else matrix [x][y] = 0;

         System.out.print(matrix[x][y] + " ");
      }
      System.out.println();

  }
  System.out.println("The sum of the diagonal values is " + diagonalSum);
    }
}
