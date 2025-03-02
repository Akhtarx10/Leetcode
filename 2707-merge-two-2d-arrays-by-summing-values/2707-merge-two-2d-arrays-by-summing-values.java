class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> ans = new ArrayList<>();

        int i=0,j=0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(Arrays.asList(Math.min(nums1[i][0], nums2[j][0]), nums1[i][1] + nums2[j][1]));
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                ans.add(Arrays.asList(nums1[i][0], nums1[i][1]));
                i++;
            }else{
                ans.add(Arrays.asList(nums2[j][0], nums2[j][1]));
                j++;
            }
        } 
        while (i < nums1.length) {
            ans.add(Arrays.asList(nums1[i][0], nums1[i][1]));
            i++;
        }

        while (j < nums2.length) {
            ans.add(Arrays.asList(nums2[j][0], nums2[j][1]));
            j++;
        }

        return ans.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
    }
}