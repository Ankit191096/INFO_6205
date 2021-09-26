import java.util.HashSet;

// Time Complexity = O(n)
// Space Complexity = O(N + M)
public class Question4 {
    public static void main(String[] args) {
        int[] array={1, 2};       // Space Complexity O(N)
        int n = array.length / 3;
        HashSet<Integer> output= new HashSet<>();       // Space Complexity O(M)
        for(int i=0; i< array.length; i++){
            int k = countOfNum(array, array[i]);
            if(k > n){
                output.add(array[i]);
            }
        }
        System.out.println(output);
    }

    public static int countOfNum(int[] array, int k){
        int count=0;
        for(int i=0; i< array.length; i++){
          if(k == array[i]){
             count++;
          }
        }
        return count;
    }
}
