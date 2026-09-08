class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = new int[7];
        dice[a]++; dice[b]++; dice[c]++; dice[d]++;
        
        int p = 0, q = 0, r = 0;
        
        for (int i = 1; i < 7; i++) {
            if (dice[i] == 4) p = i;
            if (dice[i] == 3) p = i;
            if (dice[i] == 2) { 
                if (p == 0) p = i; 
                else q = i;
            }
            if (dice[i] == 1) {
                if (q == 0) q = i;
                else r = i;
            }
        }
        
        if (dice[p] == 4) return 1111 * p;
        if (dice[p] == 3) return (10*p + q) * (10*p + q);
        if (dice[p] == 2 && dice[q] == 2) return (p+q) * Math.abs(p-q);
        if (dice[p] == 2) return q * r;
        
        return Math.min(Math.min(a,b), Math.min(c,d));
    }
}