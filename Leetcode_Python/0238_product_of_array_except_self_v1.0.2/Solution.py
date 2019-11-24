class Solution(object):
    """
    Initialize an empty array result[] for storing the product of all integers on the left of
    [exception]. Declare this array with all elements equals to 1. The size of this array is
    that of nums.
    Start the first loop.
    The start index of this loop should be 1 (Avoid index out of range)
    result[exception] is the product of result[exception - 1] * nums[exception - 1].
    Done with the first loop.
    Initialize and declare an integer "right" to keep track the product of all integers on the
    right of [exception].
    Start the second loop.
    For each iteration, update result[exception] as result[exception] * right, and then
    update right as right * nums[i].
    Done with the second loop.
    Now, the result[] array is the returned value.
    """
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        size = len(nums)
        result = [1] * size

        for exception in range(1, size):
            result[exception] = result[exception - 1] * nums[exception - 1]

        right = 1

        for exception in range(size - 1, -1, -1):
            result[exception] *= right
            right *= nums[exception]

        return result
