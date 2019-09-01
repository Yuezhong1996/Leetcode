class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        string = ""

        while num / 1000 > 0:
            string += "M"
            num -= 1000

        while num / 900 > 0:
            string += "CM"
            num -= 900

        while num / 500 > 0:
            string += "D"
            num -= 500

        while num / 400 > 0:
            string += "CD"
            num -= 400

        while num / 100 > 0:
            string += "C"
            num -= 100

        while num / 90 > 0:
            string += "XC"
            num -= 90

        while num / 50 > 0:
            string += "L"
            num -= 50

        while num / 40 > 0:
            string += "XL"
            num -= 40

        while num / 10 > 0:
            string += "X"
            num -= 10

        while num / 9 > 0:
            string += "IX"
            num -= 9

        while num / 5 > 0:
            string += "V"
            num -= 5

        while num / 4 > 0:
            string += "IV"
            num -= 4

        while num / 1 > 0:
            string += "I"
            num -= 1

        return string


solution = Solution()
solution = solution.intToRoman(3)
print(solution)
