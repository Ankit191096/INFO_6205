public class Question9{

    // Time Complexity = O(log n)   because we are using binary search
    // Space Complexity = O(N)
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4};
        int k= 2;
        System.out.println( missingNos(array,k) );

    }

    public static int missingNos(int[] array, int k){
        int n = array.length;
        int low = 0;
        int high = array.length-1;
        int mid;

        while (low <= high) {
            mid = (high + low)/2;
            int temp = array[mid] - (mid + 1);
            if( temp == k){
                if(mid > 0 && (array[mid - 1] - mid) == k){
                    high = mid - 1;
                    continue;
                }
                return array[mid] -1;
            }
            if(temp < k){
                low = mid + 1;
            }else if(temp > k){
                high = mid - 1;
            }
        }

        if(high < 0){
            return k;
        }
        int a= array[high] - (high +1);
        k = k - a;
        return array[high] + k;
    }
}
