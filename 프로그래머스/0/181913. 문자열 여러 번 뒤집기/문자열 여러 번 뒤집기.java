class Solution {
    public String solution(String my_string, int[][] queries) {
        
        char[] arr = my_string.toCharArray();
        
        for (int i=0; i<queries.length; i++) {
            int l = queries[i][0]; int r = queries[i][1];
            
            while (l<r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++; r--;
            }
        }
        
        return new String(arr);
    }
}