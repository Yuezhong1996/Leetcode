from Solution import *


solution = Solution()
nums = [3, 2, 2, 3]
val = 3
length = solution.removeElement(nums, val)

print "Length is", length

for number in nums:
    print number,
