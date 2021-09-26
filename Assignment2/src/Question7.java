public class Question7 {

    // Time Complexity = O(n)
    // Space Complexity = O(N)
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(peakElement(array));
    }

    public static int peakElement(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                return i;
            }
        }
        return array.length - 1;
    }
}

