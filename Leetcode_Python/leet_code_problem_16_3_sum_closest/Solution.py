import sys


class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        difference = sys.maxint
        sum_up = sys.maxint
        nums.sort()

        for i in range(len(nums) - 2):
            front = i + 1
            end = len(nums) - 1

            while front < end:

                if nums[i] + nums[front] + nums[end] == target:
                    return target
                elif nums[i] + nums[front] + nums[end] < target:
                    if target - (nums[i] + nums[front] + nums[end]) < difference:
                        difference = target - (nums[i] + nums[front] + nums[end])
                        sum_up = nums[i] + nums[front] + nums[end]

                    front += 1
                else:
                    if nums[i] + nums[front] + nums[end] - target < difference:
                        difference = nums[i] + nums[front] + nums[end] - target
                        sum_up = nums[i] + nums[front] + nums[end]

                    end -= 1

        return sum_up


solution = Solution()
solution = solution.threeSumClosest([-1, 2, 1, -4], 1)
print(solution)
