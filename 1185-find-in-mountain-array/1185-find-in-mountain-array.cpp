/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *   public:
 *     int get(int index);
 *     int length();
 * };
 */

class Solution {
public:
    int height(MountainArray &arr,int n){
        int start=0,end=n-1;
        int result=0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr.get(mid+1)>arr.get(mid)){
                start=mid+1;
                result=mid+1;
            }
            else{
                end=mid;
            }
        }
        return result;
    }
    int findLeft(MountainArray &arr,int t,int l,int r){
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr.get(mid)<t){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
    int findRight(MountainArray &arr,int t,int l,int r){
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr.get(mid)>t){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
    int findInMountainArray(int target, MountainArray &mountainArr) {
        int n=mountainArr.length();
        if(n<3){
            return -1;
        }
        int peak= height(mountainArr,n);
        int leftindex= findLeft(mountainArr,target,0,peak);
        if (mountainArr.get(leftindex) == target)
           return leftindex;
        int rightindex = findRight(mountainArr, target, peak + 1, n - 1);
        if (mountainArr.get(rightindex) == target)
           return rightindex;
        return -1;
    }
};