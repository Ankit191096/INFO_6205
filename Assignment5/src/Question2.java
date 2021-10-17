

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(M + N)
import java.util.HashMap;

public class Question2 {
    public String reformatDate(String date) {
        String[] token = date.split(" ");
        String day = "";
        HashMap<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        for (int i = 0; i < token[0].length(); i++) {
            if (Character.isDigit(token[0].charAt(i)))
                day += token[0].charAt(i);
        }
        if (day.length() == 1)
            day = "0" + day;
        String month = map.get(token[1]);
        String year = token[2];
        return year + "-" + month + "-" + day;
    }
}
