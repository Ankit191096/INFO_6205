import java.util.HashSet;

// Time Complexity = O(n)
// Space Complexity = O(W + X + Y + Z)
public class Question3 {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};       // Space Complexity = O(W)
        int[] arr2 = {9, 4, 9, 8, 4};       //Space Complexity = O(X)
        HashSet<Integer> set1 = new HashSet<>();    //Space Complexity = O(Y)
        HashSet<Integer> set2 = new HashSet<>();    //Space Complexity = O(Z)
        for(int i = 0; i < arr1.length; i++){
                set1.add(arr1[i]);
        }
        for(int j = 0; j < arr2.length; j++){
                set2.add(arr2[j]);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}


