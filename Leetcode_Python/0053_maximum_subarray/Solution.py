import sys


class Solution(object):
    def maxSubArray(self, nums):
        """
        Initialize and declare current_sum to be 0 and sum to be minimum integer.
        The returned variable is sum.
        Use current_sum to keep track of cumulative sum of sub-array.

        For each iteration:
        Obtain the larger value between nums[i] and current_sum + nums[i].
        Obtain the larger value between sum and current_sum.

        :type nums: List[int]
        :rtype: int
        """
        size = len(nums)
        current_sum = 0
        summation = -sys.maxint - 1

        for i in range(size):
            current_sum = max(nums[i], current_sum + nums[i])
            summation = max(summation, current_sum)

        return summation
