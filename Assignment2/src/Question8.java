public class Question8 {


    // Time Complexity = O(n ^ 2)
    // Space Complexity = O(N)
    public static void main(String[] args) {
        int[] array = {3, 1, 3, 4, 2};
        sortArray(array);
        for(int i = 0; i< array.length-1; i++){
            if(array[i] == array[i+1]){
                System.out.println(array[i]);
            }
        }
    }

    public static void sortArray(int[] array){
        int temp = 0;
        for(int i = 0; i< array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                }
            }
        }
    }
}
