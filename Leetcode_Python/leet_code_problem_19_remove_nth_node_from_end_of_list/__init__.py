from Solution import *
from ListNode import *


solution = Solution()
head = ListNode(1)
second = ListNode(2)
third = ListNode(3)
fourth = ListNode(4)
fifth = ListNode(5)
n = 2

head.next = second
second.next = third
third.next = fourth
fourth.next = fifth

solution = solution.removeNthFromEnd(head, n)
solution.print_all_nodes()
