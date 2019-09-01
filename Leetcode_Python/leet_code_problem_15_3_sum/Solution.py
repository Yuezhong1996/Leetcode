class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        result = []
        nums.sort()
        size = len(nums)

        for i in range(size):
            front = i + 1
            end = size - 1

            while front < end:
                if nums[front] + nums[end] < 0 - nums[i]:
                    front += 1
                elif nums[front] + nums[end] > 0 - nums[i]:
                    end -= 1
                else:
                    if [nums[i], nums[front], nums[end]] not in result:
                        result.append([nums[i], nums[front], nums[end]])

                    front += 1
                    end -= 1

        return result


solution = Solution()
solution = solution.threeSum([-1, 0, 1, 2, -1, -4])
print(solution)
