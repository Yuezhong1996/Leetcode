# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
from ListNode import *


class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        fast = head
        slow = ListNode(0)
        slow.next = head

        while n > 0:
            fast = fast.next
            n -= 1

        prev = slow
        prev.next = head

        while fast != None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next
        return prev.next
