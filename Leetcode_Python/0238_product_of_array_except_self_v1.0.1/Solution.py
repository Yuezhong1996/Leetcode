# Declare three arrays, left[], right[], and product[]. Do iterations twice.
# First time, traverse from left to right. Calculate each product on the left of the exception and
# store these products to left[]. If exception is 0, then left[exception] is 1. Else
# left[exception] is nums[exception - 1] * left[exception - 1].
# Second time, traverse from right to left. Calculate each product on the right of the exception and
# store these products to right[]. If exception is (size of nums) - 1, then right[exception] is 1. Else
# right[exception] is nums[exception + 1] * right[exception + 1].
# Finally multiply left[i] and right[i] and store it to product[i].


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        size = len(nums)
        left = [0] * size
        right = [0] * size
        product = [0] * size

        left[0] = 1

        for exception in range(1, size):
            left[exception] = left[exception - 1] * nums[exception - 1]

        right[size - 1] = 1

        for exception in reversed(range(size - 1)):
            right[exception] = right[exception + 1] * nums[exception + 1]

        for i in range(0, size):
            product[i] = left[i] * right[i]

        return product
