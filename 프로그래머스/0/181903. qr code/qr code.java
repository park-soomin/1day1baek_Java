class Solution {
    public String solution(int q, int r, String code) {
        
        StringBuilder sb = new StringBuilder();
        
        while (r < code.length()) {
            sb.append(code.charAt(r));
            r += q;
        }
        
        return sb.toString();
    }
}