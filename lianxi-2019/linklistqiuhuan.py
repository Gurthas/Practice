# coding = utf-8
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def hasCycle(self, head):
        if not head or head.next:
            return False
        slow = head.next
        fast = head.next.next
        count = 0
        while slow != fast:
            if not slow.next or fast.next or fast.next.next:
                return False
            slow = slow.next
            fast = fast.next.next
            count += 1
            return count
        if slow == fast:
            return True

if __name__ == '__main__':
    pass
