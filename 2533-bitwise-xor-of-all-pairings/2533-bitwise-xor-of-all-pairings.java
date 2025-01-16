class Solution {
  public int xorAllNums(int[] nums1, int[] nums2) {
    int xors1 = 0, xors2 = 0;
    for (int num : nums1) xors1 ^= num;
    for (int num : nums2) xors2 ^= num;

    return (nums1.length % 2 * xors2) ^ (nums2.length % 2 * xors1);
  }
}
