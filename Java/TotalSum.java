import java.util.Scanner;
public class TotalSum {
    public static void main (String[] args) {
        String a="coding";
        for(int i=2;i<5;i++)
        {
            System.out.print(a.substring(i-2,i+1));
        }
        // ----------------------------------------------------------
        // String a="coding",b="ninjas";
        // if(a.contains("ing"))
        // {
        //     a+=b;
        // }
        // else
        // {
        //     b+="ing";
        // }
        // System.out.print(b+a);
        
// -------------------------------------------------------------------------------
    // public static int[][] takeInput(){
    //     Scanner s=new Scanner(System.in);
    //     int N=s.nextInt();
	// 	int row=s.nextInt();
	// 	int col=s.nextInt();
	// 	int[][] arr=new int[row][col];
	// 	for(int i=0;i<row;i++) {
	// 		for(int j=0;j<col;j++) {
	// 			arr[i][j]=s.nextInt();
	// 		}
    //     }
    //     return arr;
    // }

    // public static void totalSum(int[][] arr) {
    //     int n=arr.length;
    //     int requiredSum = 0;
         
    //     // Traverse arr[][]
    //     // Loop from i to N-1 for rows
    //     for (int i = 0; i < n; i++) {
     
    //         // Loop from j = N-1 for columns
    //         for (int j = 0; j < n; j++) {
     
    //             // Condition for diagonal
    //             // elements
    //             if (i == j || (i + j) == n - 1) {
    //                 requiredSum += arr[i][j];
    //             }
     
    //             // Condition for Boundary
    //             // elements
    //             else if (i == 0 || j == 0 || i == n - 1|| j == n - 1) {
    //                 requiredSum += arr[i][j];
    //             }
    //         }
    //     }
     
    //     // Print the final Sum
    //     System.out.println(requiredSum);
    // }
     
    // // Driver Code
    // public static void main(String args[])
    // {
    //     int arr[][]=takeInput();
    //     // int arr[][] = { { 1, 2, 3, 4, 5},{ 6, 7, 8, 9, 10 },
    //     //                 { 11, 12, 13, 14, 15 },{ 16, 17, 18, 19, 20 }, {21, 22, 23, 24, 25} };
     
    //     totalSum(arr);
         
    }
}



