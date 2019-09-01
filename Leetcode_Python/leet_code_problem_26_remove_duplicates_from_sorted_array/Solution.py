class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        next_unique_element_index = 0

        if len(nums) <= 1:
            return len(nums)

        for current_element in range(len(nums) - 1):
            if nums[current_element] != nums[current_element + 1]:
                nums[next_unique_element_index] = nums[current_element]
                next_unique_element_index += 1

        nums[next_unique_element_index] = nums[len(nums) - 1]
        next_unique_element_index += 1

        return next_unique_element_index
