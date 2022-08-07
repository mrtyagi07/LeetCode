class Solution {
    int mod = 1_000_000_007;
    public int countVowelPermutation(int n) {
        // a can follow: e, i, u
        // e can follow: a, i
        // i can follow: e, o
        // o can follow: i
        // u can follow: i, o
        
        long a = 1;
        long e = 1;
        long i = 1;
        long o = 1;
        long u = 1;
        
        for (int k = 1; k < n; k++) {
            long aa = a;
            long ee = e;
            long ii = i;
            long oo = o;
            long uu = u;
            a = (ee + ii + uu) % mod;
            e = (aa + ii) % mod;
            i = (ee + oo) % mod;
            o = ii % mod;
            u = (ii + oo) % mod;
        }
        
        long res = ((((a + e) % mod + i) % mod + o) % mod + u) % mod; 
        return (int) res;
    }
}