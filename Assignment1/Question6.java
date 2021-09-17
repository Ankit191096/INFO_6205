package Assignment1;


    //Time complexity = O(n)
    // Space Complexity = O(N + M)
public class Question6 {
    public static void main(String[] args) {
       int[] array= {3,1,2,4,5,8};
        int[] temp = new int[array.length];
        evenOdd(array, temp);


        //O(n)
        for(int i : temp){
          System.out.print(i + " ");
       }
    }

    public static void evenOdd(int[] array, int[] temp){
        int n=0;
        int m= temp.length-1;

        // O(n)
        for(int i =0; i< array.length; i++){
            if (array[i] % 2 != 0){
                temp[m] = array[i];
                m--;
            }else{
                temp[n] = array[i];
                n++;
            }
        }
    }
}