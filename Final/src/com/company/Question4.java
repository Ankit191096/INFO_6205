package com.company;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static void main(String[] args) {
        String words[] = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isWordAlien(words, order));

    }
    static Map<Character, Integer> charIndexMap = new HashMap<>();

    public static boolean isWordAlien(String[] word, String order){
        for(int i = 0; i < order.length(); i++){
            charIndexMap.put(order.charAt(i), i);
        }
        for(int i = 1; i < word.length; i++){
            String firstWord =word[i - 1];
            String secondWord = word[i];
            for(int j = 0; j < firstWord.length(); j++){
                if(j == secondWord.length())
                    return false;
                char firstChar = firstWord.charAt(j);
                char secondChar = secondWord.charAt(j);
                if(charIndexMap.get(firstChar) < charIndexMap.get(secondChar))
                    break;
                if(charIndexMap.get(firstChar) > charIndexMap.get(secondChar))
                    return false;
            }
        }
        return true;
    }
}
