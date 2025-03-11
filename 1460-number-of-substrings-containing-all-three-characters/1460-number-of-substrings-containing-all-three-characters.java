class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1};  
        int count = 0;
        
        for (int right = 0; right < s.length(); right++) {
            lastSeen[s.charAt(right) - 'a'] = right;
            count += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
        }
        
        return count;
    }
}
