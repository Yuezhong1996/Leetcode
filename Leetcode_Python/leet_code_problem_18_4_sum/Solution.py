class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        result = []

        nums.sort()

        size = len(nums)

        for i in range(size):
            for j in range(i + 1, size):
                front = j + 1
                end = size - 1

                while front < end:
                    sum_up = nums[i] + nums[j] + nums[front] + nums[end]

                    if sum_up < target:
                        front += 1
                    elif sum_up > target:
                        end -= 1
                    else:
                        if [nums[i], nums[j], nums[front], nums[end]] not in result:
                            result.append([nums[i], nums[j], nums[front], nums[end]])

                        front += 1
                        end -= 1

        return result


solution = Solution()
nums = [1, 0, -1, 0, -2, 2]
target = 0
solution = solution.fourSum(nums, target)
print(solution)
