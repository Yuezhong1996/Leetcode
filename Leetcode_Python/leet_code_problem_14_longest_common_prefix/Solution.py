class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        size = len(strs)

        if size == 0:
            return ""

        if size == 1:
            return strs[0]

        # sort the array of strings
        strs = sorted(strs)

        # find the minimum length from first and last string
        end = min(len(strs[0]), len(strs[size - 1]))

        # find the common prefix between the first and last string
        i = 0
        while i < end and strs[0][i] == strs[size - 1][i]:
            i += 1

        return strs[0][0: i]


solution = Solution()
solution = solution.longestCommonPrefix(["flower","flow","flight"])
print(solution)
