class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            st.push(i + 1);

            if (i == n || pattern.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    res.append(st.pop());
                }
            }
        }
        return res.toString();
    }
}
