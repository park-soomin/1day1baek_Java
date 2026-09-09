import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        
        list.sort((a, b) -> a.compareTo(b));
        
        return list.toArray(new String[0]);
    }
}