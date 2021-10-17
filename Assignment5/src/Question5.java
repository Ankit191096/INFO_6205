

// Tried on LeetCode
// Time Complexity = O(N ^ 2)
// Space Complexity = O(1)
public class Question5 {
    public int maxProfit(int prices[]) {
        int length = prices.length;
        int maxprof = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprof)
                    maxprof = profit;
            }
        }
        return maxprof;
    }
}
