import java.util.Scanner;
public class LargestRowOrColumn {

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

	
	public static void findLargest(int[][] arr) {
		
		int row=arr.length;
		int col=arr[0].length;
		// ---------------maxRow Sum----------------------
		int maxRowSum=Integer.MIN_VALUE;
		int maxRow=Integer.MIN_VALUE;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum+=arr[i][j];
			}
			if(maxRowSum < sum) {
				maxRowSum=sum;
				maxRow=i;
			}
		}

		// --------max Col Sum--------------------
		int maxColSum=Integer.MIN_VALUE;
		int maxCol=Integer.MIN_VALUE;
		
		for(int i=0;i<col;i++) {
			int sum=0;
			for(int j=0;j<row;j++) {
				sum+=arr[j][i];
			}
			if(maxColSum< sum) {
				maxColSum=sum;
				maxCol=i;
			}
		}
		
		if(maxRowSum>=maxColSum ) {
			System.out.println("row "+maxRow+" "+maxRowSum);
		}
		else {
			System.out.println("column "+ maxCol+" "+maxColSum);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[][] arr=takeInput();
		findLargest(arr);

	}

}
