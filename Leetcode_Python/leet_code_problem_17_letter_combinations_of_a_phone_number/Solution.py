class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        number_to_character = {"2": "abc", "3": "def", "4": "ghi", "5": "jkl", "6": "mno",
                               "7": "pqrs","8": "tuv", "9": "wxyz"}
        result = []

        if len(digits) == 0 or digits == "1":
            return result

        result.append("")

        # traverse input string #
        for digit in digits:
            temp_list = number_to_character[digit]
            list_to_be_appended = []

            for lst in temp_list:
                for res in result:
                    list_to_be_appended.append(res + lst)

            result = list_to_be_appended

        return result


solution = Solution()
solution = solution.letterCombinations("23")
print(solution)
