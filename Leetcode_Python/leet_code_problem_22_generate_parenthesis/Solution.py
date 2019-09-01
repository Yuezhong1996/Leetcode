class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        temp = ""
        number_of_left_added = 0
        number_of_right_added = 0

        def dfs_backtrack(self, result, temp, left, right, n):
            if left == n and right == n:
                result.append(temp)

            if left < n:
                dfs_backtrack(self, result, temp + "(", left + 1, right, n)

            if right < left:
                dfs_backtrack(self, result, temp + ")", left, right + 1, n)

            return result

        return dfs_backtrack(self, result, temp, number_of_left_added,
                             number_of_right_added, n)
