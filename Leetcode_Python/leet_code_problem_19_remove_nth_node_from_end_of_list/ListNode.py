class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

    # This function prints all nodes, just for test
    def print_all_nodes(self):
        list_node = self  # start from the head node

        while list_node != None:
            print list_node.val
            list_node = list_node.next
