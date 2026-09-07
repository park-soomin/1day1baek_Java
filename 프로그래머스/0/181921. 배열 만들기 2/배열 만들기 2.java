import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=l; i<=r; i++) {
            String s = String.valueOf(i);
            
            if (s.matches("[05]+")) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
    
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}