package Assignment1;

    //Time Complexity  =  O(n^2)
    //Space Complexity = O(N)
public class Question3 {
    public static void main(String[] args) {
      int[] array= {1,4,3,2};
      maxValue(array);
    }

    public static void maxValue(int[] array) {
        int temp = 0;
        //O(n^2)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int maxValue = 0;
        //O(n)
        for (int i = 0; i < array.length ; i += 2) {
            if (i % 2 == 0) {
                maxValue += array[i];
            }
        }
        System.out.println( maxValue );
    }
}
