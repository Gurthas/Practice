# coding = utf-8
#判断链表是否存在环
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def hasCycle(self, head):
        if not head or not head.next:
            return False
        slow = head.next
        fast = head.next.next
        count = 0
        while slow != fast:
            if not slow.next or not fast.next or not fast.next.next:
                print('no cycle')
                return False
            slow = slow.next
            fast = fast.next.next
            count += 1
        if slow == fast:
            print('环的长度:'+str(count+1))
            return True

if __name__ == '__main__':
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node3
    sol = Solution()
    f = sol.hasCycle(node1)
    print(f)


