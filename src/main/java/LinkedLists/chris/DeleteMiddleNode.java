package LinkedLists.chris;

public class DeleteMiddleNode {

  public void solution(Node head) {
    Node slow = head;
    Node fast = head;
    Node prev = null;

    while (fast != null && fast.next != null && fast.next.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    prev.next = slow.next;
  }

  public static void main(String[] args) {
    Node listOdd = Node.createList(1, 2, 3, 4, 5, 6, 7);
    Node listEven = Node.createList(1, 2, 3, 4, 5, 6);
    new DeleteMiddleNode().solution(listOdd);
    new DeleteMiddleNode().solution(listEven);
    Node.printList(listOdd);
    Node.printList(listEven);
  }
}
