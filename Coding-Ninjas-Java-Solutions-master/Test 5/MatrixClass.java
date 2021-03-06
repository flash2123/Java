public class MatrixClass {
    int [][] matrix;
	
	mat(int [][] mat)
	{
		matrix=mat;
	}
		
	
	    public static mat add(mat a,mat b)
	    {
            int[][] ans = new int[a.matrix.length][a.matrix[0].length];
            for(int i = 0; i < a.matrix.length; i++){
                for(int j = 0; j < a.matrix[0].length; j++){
                    ans[i][j]=a.matrix[i][j]+b.matrix[i][j];
                }
            }
            mat answer = new mat(ans);
            return answer;

	      
	    }
	    public static mat multiply(mat a,mat b)
	    {
            int[][] ans = new int[a.matrix.length][b.matrix[0].length];
            for(int i = 0; i < a.matrix.length; i++){
                for(int j = 0; j < b.matrix[0].length; j++){
                    for(int k=0;k<a.matrix[0].length;k++){
                        ans[i][j]+=a.matrix[i][k]*b.matrix[k][j];
                    }
                }
            }
            mat answer = new mat(ans);
            return answer;
	       
	    }
	    public static mat transpose(mat m)
	    {
        	int[][] tans_matrix = new int[m.matrix.length][m.matrix[0].length];
            for(int i = 0; i < m.matrix.length; i++){
                for(int j = 0; j < m.matrix[0].length; j++){
                    tans_matrix[i][j]=m.matrix[j][i];
                }
            }
            mat answer = new mat(tans_matrix);
            return answer;
	    }
	    public static mat rotate(mat m)
	    {
            int r = m.matrix.length;
        	int c = m.matrix[0].length;
            int[][] rotate_mat = new int[c][r];
        	for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    rotate_mat[c-j-1][i]=m.matrix[i][j];
                }
            }
            mat answer = new mat(rotate_mat);
            return answer;
    	}
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
    
}
