package LinkedLists.chris;

import java.util.Stack;

public class SumLists {

  // Tested in leetcode: https://leetcode.com/problems/add-two-numbers/
  public Node solution(Node a, Node b) {
    boolean carryOver = false;
    Node res = new Node(-1);
    Node resHead = res;

    while (a != null || b != null) {
      int nodeSum = 0;

      if (a != null && b != null) {
        nodeSum = a.data + b.data + (carryOver ? 1 : 0);
        a = a.next;
        b = b.next;
      } else if (a == null) {
        nodeSum = b.data + (carryOver ? 1 : 0);
        b = b.next;
      } else if (b == null) {
        nodeSum = a.data + (carryOver ? 1 : 0);
        a = a.next;
      }

      carryOver = nodeSum > 9;
      Node newNode = new Node(nodeSum > 9 ? nodeSum % 10 : nodeSum);
      res.next = newNode;
      res = res.next;

    }

    if (carryOver) {
      Node newNode = new Node(1);
      res.next = newNode;
    }

    return resHead.next;
  }

  // Tested in leetcode: https://leetcode.com/problems/add-two-numbers-ii/
  public Node solution2(Node l1, Node l2) {
    Stack s1 = new Stack<>();
    Stack s2 = new Stack<>();
    boolean carryOver = false;
    Node res = null;

    while (l1 != null || l2 != null) {
      if (l1 != null) {
        s1.push(l1.data);
        l1 = l1.next;
      }
      if (l2 != null) {
        s2.push(l2.data);
        l2 = l2.next;
      }
    }

    while (!s1.empty() || !s2.empty()) {
      int nodeSum = 0;

      if (!s1.empty() && !s2.empty()) {
        nodeSum = (Integer) s1.pop() + (Integer) s2.pop() + (carryOver ? 1 : 0);
      } else if (s1.empty()) {
        nodeSum = (Integer) s2.pop() + (carryOver ? 1 : 0);
      } else if (s2.empty()) {
        nodeSum = (Integer) s1.pop() + (carryOver ? 1 : 0);
      }

      carryOver = nodeSum > 9;
      Node newNode = new Node(nodeSum > 9 ? nodeSum % 10 : nodeSum);
      newNode.next = res;
      res = newNode;

    }

    if (carryOver) {
      Node newNode = new Node(1);
      newNode.next = res;
      res = newNode;
    }

    return res;
  }

  public static void main(String[] args) {
    Node a = Node.createList(1, 6, 1);
    Node b = Node.createList(5, 9, 2, 9);

    Node sum = new SumLists().solution2(a, b);
    Node.printList(sum);
  }
}
