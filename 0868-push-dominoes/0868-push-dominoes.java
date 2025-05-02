public class Solution {
    public String pushDominoes(String dominoes) {
        int length = dominoes.length();
        Deque<Integer> queue = new ArrayDeque<>();
        int[] times = new int[length];
        Arrays.fill(times, -1);
        List<Character>[] forces = new List[length];
        for (int i = 0; i < length; ++i) {
            forces[i] = new ArrayList<>();
        }
        for (int i = 0; i < length; ++i) {
            char force = dominoes.charAt(i);
            if (force != '.') {
                queue.offer(i);
                times[i] = 0;
                forces[i].add(force);
            }
        }
        char[] result = new char[length];
        Arrays.fill(result, '.');
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            if (forces[idx].size() == 1) {
                char force = forces[idx].get(0);
                result[idx] = force;
                int nextIdx = force == 'L' ? idx - 1 : idx + 1;
                if (nextIdx >= 0 && nextIdx < length) {
                    int currentTime = times[idx];
                    if (times[nextIdx] == -1) {
                        queue.offer(nextIdx);
                        times[nextIdx] = currentTime + 1;
                        forces[nextIdx].add(force);
                    } else if (times[nextIdx] == currentTime + 1) {
                        forces[nextIdx].add(force);
                    }
                }
            }
        }
        return new String(result);
    }
}
