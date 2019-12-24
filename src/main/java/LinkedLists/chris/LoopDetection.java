package LinkedLists.chris;

public class LoopDetection {

  // Tested in https://leetcode.com/problems/linked-list-cycle/.
  // Note: leetcode question expects a boolean instead of the defected node
  public Node solution(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast) {
        return slow;
      }
    }

    return null;
  }
}
