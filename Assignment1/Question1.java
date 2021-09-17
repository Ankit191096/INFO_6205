package Assignment1;

//Time Complexity =  O(n)
//Space Complexity  = O(N)
public class Question1 {
    public static void main(String[] args) {
        int[] array= {2,0,2,1,1,0};   //     space complexity =  O(N)
        sort(array,1);
        //O(n)
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array,int midValue){
        int low=0;
        int mid=0;
        int high= array.length-1;
        int temp;
        //O(n)
        while(mid <= high){
            if(array[mid] < midValue){
              temp=array[mid];
              array[mid]=array[low];
              array[low]=temp;
              mid++;
              low++;
            }else if(array[mid] > midValue){
                temp=array[mid];
                array[mid]= array[high];
                array[high]= temp;
                high--;
            }else{
                mid++;
            }
        }
    }
}
