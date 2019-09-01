from Solution import *
from ListNode import *


solution = Solution()
l1 = ListNode(1)
second = ListNode(2)
third = ListNode(4)

l2 = ListNode(1)
second2 = ListNode(3)
third2 = ListNode(4)

l1.next = second
second.next = third

l2.next = second2
second2.next = third2

solution = solution.mergeTwoLists(l1, l2)
