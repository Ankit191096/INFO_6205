

// Tried on LeetCode
// Time Complexity = O(N log N)
// Space Complexity = O(N)
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Question7 {
    public static int [][] highFive(int[][] items){
        Map<Integer, PriorityQueue<Integer>> scores = new HashMap<>();
        for(int [] i: items){
            PriorityQueue<Integer> pQ = scores.getOrDefault(i[0], new PriorityQueue<>());
            pQ.offer(i[1]);
            if(pQ.size() > 5){
                pQ.poll();
            }
            scores.put(i[0], pQ );
        }
        int[][] result = new int[scores.keySet().size()][2];
        int index = 0;
        for(Integer i : scores.keySet()){
            PriorityQueue<Integer> priorityQueue = scores.get(i);
            int count = priorityQueue.size();
            int sum = 0;
            while( ! priorityQueue.isEmpty()){
                sum = sum + priorityQueue.poll();
            }
            result [index ++ ] = new int[]{ i, sum / count};
        }
        return result;
    }
}
