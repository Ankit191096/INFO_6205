package com.company;

public class Question3 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8 , 9};
        System.out.println(minStepsToReachEnd(arr));
    }

    private static int minStepsToReachEnd(int[] arr){
        int[] jumpOutputArray = new int[arr.length];
        jumpOutputArray[0] = 0;
        if(arr.length == 0 || arr[0] == 0){
            return Integer.MAX_VALUE;
        }
        for(int i = 1; i < arr.length; i++){
            jumpOutputArray[i] = Integer.MAX_VALUE;
            for(int j = 0; j < i; j++){
                if(i <= j + arr[j] && jumpOutputArray[j] != Integer.MAX_VALUE){
                    jumpOutputArray[i] = Math.min(jumpOutputArray[i], jumpOutputArray[j] + 1);
                    break;
                }
            }
        }
        return jumpOutputArray[arr.length - 1];
    }
}
