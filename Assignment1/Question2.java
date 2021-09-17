package Assignment1;

import java.util.Arrays;
import java.util.Comparator;

        // Time Complexity = O(n logn)
        // Space Complexity =   O(N)
public class Question2 {
    public static void main(String[] args) {
        int[][] arr = {{0 , 30},{5 , 10},{15 , 20}};

        Arrays.sort(arr, new Comparator<>() {
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        boolean flag = true;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i][1] > arr[i+1][0]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }


}
