import java.util.Arrays;
import java.util.Comparator;

    // Time Complexity = O(n)
    // Space Complexity = O(n)
public class Question2 {
    public static void main(String[] args) {
        int[][] arr = {{0 , 20},{5 , 10},{9 , 15}};

        Arrays.sort(arr, new Comparator<>() {
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        int count=1;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i][1] > arr[i+1][0]){
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
