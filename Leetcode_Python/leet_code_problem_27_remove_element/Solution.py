class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        pre = 0

        for current_element in range(len(nums)):
            if nums[current_element] != val:
                nums[pre] = nums[current_element]
                pre += 1

        return pre
