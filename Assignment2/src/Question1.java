import java.util.ArrayList;

public class Question1 {

    // Time Complexity = O(n)
    // Space Complexity = O(M + N)
    public static void twoSum(int[] array, int target){
        ArrayList output = new ArrayList();
       for(int i=0; i< array.length; i++){
           if(array[i] < target){
               target = target - array[i];
               int j = checkNumber(array, target);
               output.add(i);
               output.add(j);
               System.out.println(output);
               break;
           }
       }
    }

    public static int checkNumber(int[] array, int target){
        int index = 0;
        for(int i=0; i< array.length; i++){
            if(array[i] == target){
               index = i;
               break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        twoSum(array,9);
    }
}
