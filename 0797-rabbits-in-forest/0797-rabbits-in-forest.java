class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int answer : answers) {
            frequencyMap.put(answer, frequencyMap.getOrDefault(answer, 0) + 1);
        }
        int totalRabbits = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int otherRabbits = entry.getKey();
            int frequencyOfClaim = entry.getValue();
            int groupsOfRabbits = (int) Math.ceil(frequencyOfClaim / ((otherRabbits + 1) * 1.0));
            totalRabbits += groupsOfRabbits * (otherRabbits + 1);
        }
        return totalRabbits;
    }
}
