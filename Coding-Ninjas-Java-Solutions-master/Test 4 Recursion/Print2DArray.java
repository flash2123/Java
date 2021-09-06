import java.util.Scanner;
public class Print2DArray {

    public static int[][] takeInput(){
        Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
			}
        }
        return arr;
    }

    public static void print2DArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int k=0;k<(arr.length-i);k++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = takeInput();
		print2DArray(arr);
    }
    
}
