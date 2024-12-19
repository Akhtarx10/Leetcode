class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        majority=nums[0]
        votes=1
        for i in range(1,len(nums)):
            if(votes == 0):
                votes += 1
                majority = nums[i]
                
            elif(majority == nums[i]):
                votes += 1
            else:
                votes -= 1
        return majority
