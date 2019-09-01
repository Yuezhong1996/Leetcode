class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        left_to_right = str(x)
        right_to_left = left_to_right[::-1]

        return left_to_right == right_to_left


solution = Solution()
solution = solution.isPalindrome(121)
print(solution)
