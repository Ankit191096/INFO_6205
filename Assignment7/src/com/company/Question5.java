package com.company;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// Tried On LeetCode
//Time Complexity = O(2^N)
//Space Complexity =O(2^(N,K))
public class Question5 {
    class Solution {
        public int maxLength(List<String> arr) {
            Set<Integer> results = new HashSet<>(){{add(0);}};
            int best = 0;
            for (String word : arr) {
                best = Math.max(best, addWord(word, results));
            }
            return best;
        }
        private int addWord(String word, Set<Integer> results){
            int charBitSet = 0;
            int best = 0;
            for(char c: word.toCharArray()){
                int mask = 1 << c - 'a';
                if((charBitSet & mask) > 0){
                    return 0;
                }
                charBitSet += mask;
            }

            if(results.contains(charBitSet)){
                return 0;
            }
            Set<Integer> newResult = new HashSet<>();
            for(Integer res : results){
                if((res & charBitSet) > 0){
                    continue;
                }
                int newResLen = (res >> 26) + word.length();
                int newCharBitSet = (charBitSet + res) & ((1 << 26) - 1);
                newResult.add((newResLen << 26) + newCharBitSet);
                best = Math.max(best, newResLen);
            }
            results.addAll(newResult);
            return best;
        }
    }
}
