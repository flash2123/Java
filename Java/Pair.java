import java.util.Arrays;
import java.util.Scanner;
public class Pair {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int pairSum(int[] arr, int num) {

    //     Arrays.sort (arr);

    //     int res = 0;
    //     for (int l = arr.length, i = 0; i < l - 1; i++)
    //     {
    //         int v = arr [i];
    //         int j = i + 1;
    //         while (j < l && arr [j] == v) j += 1;
    //         if (j == i + 2) res += 1;
    //         i = j - 1;
    //     }

    //     return res;
    // }

    //     int i = 0, i2;
    //     int len = arr.length;
    //     int sum = 0;
    //     int curr;
    //     int lastchecked = -1;

    //     while (i < len-1) {
    //         curr = arr[i];
    //         i2 = i + 1;
    //         while (i2 < len) {
    //             if (curr == arr[i2] && arr[i2] != lastchecked) {
    //                 sum++; // add 1 to number of pairs
    //                 lastchecked = curr; 
    //                 i2++; // iterate to next
    //             } else if (arr[i2] == lastchecked) {
    //                 // more than twice - swap last and update counter
    //                 if (curr == lastchecked) {
    //                     sum--;
    //                 }
    //                 // swap with last
    //                 arr[i2] = arr[len-1];
    //                 len--;
    //             } else {
    //                 i2++;
    //             }
    //         i++;
    //     }
    // }

    // return sum;
    // }

//         Arrays.sort(arr);
//     // now we have: [1, 1, 1, 4, 4, 5, 5, 7, 7]

//     int res = 0;
//     int len = arr.length;
//     int i = 0;

//     while (i < len) {
//       // take first number
//       int sum = arr[i];
//       int c = 1;
//       i++;

//       // count all duplicates
//       while(i < len && arr[i] == sum) {
//         c++;
//         i++;
//       }
//       System.out.println("Number: " + sum + "\tCount: "+c);
//       // if we spotted number just 2 times, increment result
//       if (c == 2) {
//         res++;
//       }
//     }

//     return res;
//   }



        int count = 0;
     
        
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (num == (arr[i] + arr[j]))
                    count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        // int[] arr= takeInput();
        int arr[] = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
        int num = arr.length ;
        System.out.print(pairSum(arr, num));
    }
    
}
