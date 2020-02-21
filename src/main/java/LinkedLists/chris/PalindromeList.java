package LinkedLists.chris;

import java.util.Stack;

public class PalindromeList {

  // Tested in leetcode:
  // https://leetcode.com/problems/palindrome-linked-list/
  public boolean solution(Node head) {
    Node slow = head;
    Node fast = head;
    Stack<Integer> stack = new Stack<>();

    while (fast != null && fast.next != null) {
      stack.push(slow.data);
      slow = slow.next;
      fast = fast.next.next;
    }

    // If odd number of nodes move slow by one
    if (fast != null) {
      slow = slow.next;
    }

    while (slow != null) {
      if (stack.pop() != slow.data) {
        return false;
      }
      slow = slow.next;
    }

    return true;
  }

  public static void main(String[] args) {
    Node evenPalindrome = Node.createList(1, 2, 3, 3, 2, 1);
    Node oddPalindrome = Node.createList(1, 2, 3, 4, 3, 2, 1);
    Node evenNotPalindrome = Node.createList(1, 2, 3, 3, 5, 6);
    Node oddNotPalindrome = Node.createList(1, 2, 3, 2, 6);

    System.out.println(new PalindromeList().solution(evenPalindrome));
    System.out.println(new PalindromeList().solution(oddPalindrome));
    System.out.println(new PalindromeList().solution(evenNotPalindrome));
    System.out.println(new PalindromeList().solution(oddNotPalindrome));
  }
}
