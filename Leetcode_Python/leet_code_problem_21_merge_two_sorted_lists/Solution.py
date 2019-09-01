# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
from ListNode import *


class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

        # start of the result list #
        result = ListNode(0)

        # points to the last result node #
        last = result

        while True:
            # If either list runs out, use the other one #
            if not l1:
                last.next = l2
                break

            if not l2:
                last.next = l1
                break

            """
            compare the data of the two lists, append the smaller data into "last", and 
            advance to next node to "last"
            """
            if l1.val <= l2.val:
                last.next = l1
                l1 = l1.next
            else:
                last.next = l2
                l2 = l2.next

            # advance to "last" #
            last = last.next

        return result.next
