# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
from ListNode import *


class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev = ListNode(0)
        prev.next = head
        head = prev

        while head.next is not None and head.next.next is not None:
            p1 = head.next
            p2 = head.next.next

            head.next = p2
            p1.next = p2.next
            p2.next = p1

            head = head.next.next

        return prev.next
