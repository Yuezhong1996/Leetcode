class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        max_area = 0
        left_index = 0
        right_index = len(height) - 1

        while left_index < right_index:
            max_area = max(max_area, min(height[left_index], height[right_index]) * (right_index -
                                                                                     left_index))

            if height[left_index] < height[right_index]:
                left_index += 1
            else:
                right_index -= 1

        return max_area


solution = Solution()
solution = solution.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7])
print(solution)
