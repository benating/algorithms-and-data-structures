package LinkedLists.chris;

import java.util.ArrayList;
import java.util.List;

public class KthToLast {

  // O(n^2) because we have to get the length first
  public Node solution(Node head, int k) {
    int size = getSize(head);

    if (k >= size) {
      throw new RuntimeException("Invalid k parameter");
    }

    Node current = head;

    while ((size - 1) != k) {
      current = current.next;
      size--;
    }

    return current;
  }

  public Node solutionRecursive(Node head, int k) {
    List<Integer> acc = new ArrayList<>();
    return recursiveHelper(head, k, acc);
  }

  // O(n)
  public Node solutionIterativeImproved(Node head, int k) {
    Node pointer1 = head;
    Node pointer2 = head;
    int gap = 0;

    while(gap < k) {
      pointer2 = pointer2.next;
      gap++;
    }

    while (pointer2.next != null) {
      pointer1 = pointer1.next;
      pointer2 = pointer2.next;
    }

    return pointer1;
  }

  private Node recursiveHelper(Node head, int k, List<Integer> acc) {
    if (head == null) {
      acc.add(0);
      return null;
    }

    Node node = recursiveHelper(head.next, k, acc);

    if(acc.get(0) == k) {
      acc.set(0, acc.get(0) + 1);
      return head;
    }

    acc.set(0, acc.get(0) + 1);
    return node;
  }

  private int getSize(Node head) {
    Node temp = head;
    int size = 0;

    while (temp != null) {
      size++;
      temp = temp.next;
    }

    return size;
  }

  public static void main(String[] args) {
    Node list = Node.createList(0, 1, 2, 3, 4);
    Node node1 = new KthToLast().solutionRecursive(list, 4);
    Node node2 = new KthToLast().solutionIterativeImproved(list, 4);
    System.out.println(node1.data);
    System.out.println(node2.data);
  }
}
