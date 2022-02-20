import java.util.Arrays;
public class CheckSubset{
    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
        int i = 0, j = 0;
 
        if (n1 < n2)
            return false;
 
        Arrays.sort(arr1); // sorts arr1
        Arrays.sort(arr2); // sorts arr2
 
        while (i < n2 && j < n1) {
            if (arr1[j] < arr2[i])
                j++;
            else if (arr1[j] == arr2[i]) {
                j++;
                i++;
            }
            else if (arr1[j] > arr2[i])
                return false;
        }
 
        if (i < n2)
            return false;
        else
            return true;
 
	}

}