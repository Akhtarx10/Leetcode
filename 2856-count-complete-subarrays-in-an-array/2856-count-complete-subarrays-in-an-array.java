import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int totalDistinct = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))).size();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                seen.add(nums[j]);
                if (seen.size() == totalDistinct) {
                    count++;
                }
            }
        }
        return count;
    }
}
