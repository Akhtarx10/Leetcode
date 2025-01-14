class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int idx = orderAgnostic(mountainArr, target, 0, peak);
        if (idx != -1) {
            return idx;
        }
        return orderAgnostic(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int orderAgnostic(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            }

            if (isAsc) {
                if (midValue < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midValue > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
