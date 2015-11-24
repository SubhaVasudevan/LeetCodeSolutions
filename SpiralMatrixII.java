public class SpiralMatrixII {
   public static void main(String[] args) {
	   spiralMatrix2(3);
   }
   
   public static void spiralMatrix2(int n) {
	  
	   int[][] matrix = new int[n][n];
	   
	   int x = 0 ; int y = 0;
	   int count = 1;
	   
	   while(x <= n && y <= n)
	   {
		   
		   //if we are at the core of the matrix
		   if(n == 1) {
			   matrix[x][y] = count;
			   break;
		   }
		   
		   for(int i = 0 ; i < n-1 ; i++) {
			   matrix[x][y] = count;
			   count++;
			   y++;
		   }
		   
		   for(int i =    0 ; i < n-1 ; i++) {
			   matrix[x][y] = count;
			   count++;
			   x++;
		   }
		   
		   for(int i = 0 ; i < n-1 ; i++) {
			   matrix[x][y] = count;
			   count++;
			   y--;
		   }
		   
		   for(int i = 0 ; i < n-1 ; i++) {
			   matrix[x][y] = count;
			   count++;
			   x--;
		   }
		   
		   //going to an inner row and column
		   x++;y++;
		   
		   //decreasing the height and width of the matrix
		   n = n-2;
		   
	   }
	   
	   
	   for(int i = 0 ; i <  matrix.length ;  i++) {
		   for(int j = 0 ; j < matrix.length ; j++) {
			   System.out.print(matrix[i][j] + " ");
		   }
		   System.out.println();
	   }
   
   }
   
    
}