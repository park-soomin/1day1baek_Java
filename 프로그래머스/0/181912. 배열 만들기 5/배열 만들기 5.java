class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int[] result = new int[intStrs.length];
        int count = 0;
        
        for (int i=0; i<intStrs.length; i++) {
            if (Integer.parseInt(intStrs[i].substring(s,s+l)) > k) {
                result[count] = Integer.parseInt(intStrs[i].substring(s,s+l));
                count++;
            }
        }
        
        int[] answer = new int[count];
        for (int j=0; j<count; j++) {
            answer[j] = result[j];
        }
        
        return answer;
    }
}