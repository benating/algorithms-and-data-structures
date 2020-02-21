package LinkedLists.chris;

// Tested in leetcode: https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Intersection {

  public Node solution(Node headA, Node headB) {
    int sizeA = getSize(headA);
    int sizeB = getSize(headB);

    while(headA != null) {
      if(headA == headB) {
        return headA;
      }

      if(sizeB > sizeA) {
        headB = headB.next;
        sizeB--;
      } else if (sizeA > sizeB) {
        headA = headA.next;
        sizeA--;
      } else {
        headA = headA.next;
        headB = headB.next;
      }
    }

    return null;
  }

  private int getSize(Node head) {
    Node temp = head;
    int size = 0;
    while(temp != null) {
      size++;
      temp = temp.next;
    }

    return size;
  }
}
