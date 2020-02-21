package LinkedLists.chris;

import java.util.HashSet;

public class RemoveDups {

  public void solutionWithBuffer(Node head) {
    Node current = head;
    Node prev = null;
    HashSet<Integer> record = new HashSet<>();

    while (current != null) {
      if (record.contains(current.data)) {
        prev.next = current.next;
      } else {
        record.add(current.data);
        prev = current;
      }

      current = current.next;
    }
  }

  // O(n^2)
  public void solutionNoBuffer(Node head) {
    Node current = head;

    while (current != null) {
      Node prev = current;
      Node pointer = current.next;

      while (pointer != null) {
        if (pointer.data == current.data) {
          prev.next = pointer.next;
        } else {
          prev = pointer;
        }

        pointer = pointer.next;
      }

      current = current.next;
    }
  }

  public static void main(String[] args) {
    Node list1 = Node.createList(0, 1, 2, 2, 4, 4, 3, 3, 4, 3, 2);
    Node list2 = Node.createList(0, 1, 2, 2, 4, 4, 3, 3, 4, 3, 2);
    new RemoveDups().solutionWithBuffer(list1);
    new RemoveDups().solutionNoBuffer(list2);
    Node.printList(list1);
    Node.printList(list2);
  }
}
