import java.util.Scanner;
public class SpiralPrint {
	
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
	
	public static void spiralPrint(int[][] arr) {
		
		int row=arr.length;
		int col=arr[0].length;
		int count=0;
		int rs=0,re=row-1,cs=0,ce=col-1;
		while(count<row*col) {
			
			for(int i=cs;i<=ce;i++) {
				System.out.print(arr[rs][i]+" ");
				count++;
			}
			rs++;
			for(int i=rs;i<=re;i++) {
				System.out.print(arr[i][ce]+" ");
				count++;
			}
			ce--;
			for(int i=ce;i>=cs;i--) {
				System.out.print(arr[re][i]+" ");
				count++;
			}
			re--;
			for(int i=re;i>=rs;i--) {
				System.out.print(arr[i][cs]+" ");
				count++;
			}
			cs++;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=takeInput();
		spiralPrint(arr);

	}

}
