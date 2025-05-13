class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        long length = s.length();
        long[] freq = new long[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < t; i++) {
            long[] nextFreq = new long[26];

            // handle 'z' → "ab"
            long zCount = freq[25];
            length = (length + zCount) % MOD;
            nextFreq[0] = (nextFreq[0] + zCount) % MOD; // 'a'
            nextFreq[1] = (nextFreq[1] + zCount) % MOD; // 'b'

            // handle other characters shift
            for (int j = 0; j < 25; j++) {
                nextFreq[j + 1] = (nextFreq[j + 1] + freq[j]) % MOD;
            }

            freq = nextFreq;
        }

        return (int) length;
    }
}
