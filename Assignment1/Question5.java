package Assignment1;

import java.util.Arrays;

    // Time Complexity = O(n log n)
    // Space Complexity = O(N)
public class Question5 {
    public static void main(String[] args) {
       String s= "anagram";
       String t= "nagaram";
       anagram(s,t);
    }

    public static void anagram(String s, String t){
        boolean output = true;
        char array1[]= s.toCharArray();
        char array2[]= t.toCharArray();
        if(array1.length != array2.length){
            return;
        }else{
            Arrays.sort(array1);
            Arrays.sort(array2);

            output = Arrays.equals(array1, array2);

            if(output){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }


    }
}
