import java.util.ArrayList;

//Time Complexity = O(n)
// Space Complexity = O(N+M)
public class Question5 {

    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};  // Space Complexity O(N)
        starEndPosition(array, 8);
    }

    public static void starEndPosition(int[] array, int target){
        ArrayList output = new ArrayList();   // Space Complexity O(M)
        for(int i=0; i< array.length; i++){
            if(array[i] == target){
                output.add(i);
            }
        }
        if(output.isEmpty()){
            output.add(-1);
            output.add(-1);
            System.out.println(output);
        }else{
            System.out.println(output);
        }
    }
}
