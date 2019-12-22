package LinkedLists.chris;

public class Node {

  int data;
  Node next;

  public Node(int data) {
    this.data = data;
  }

  public static void printList(Node head) {
    Node pointer = head;
    StringBuilder builder = new StringBuilder();

    while (pointer != null) {
      builder.append(pointer.data);
      builder.append(" ");
      pointer = pointer.next;
    }

    System.out.println(builder.toString());
  }

  public static Node createList(int... data) {
    Node head = new Node(-1);
    Node pointer = head;

    for(int value : data) {
      Node newNode = new Node(value);
      pointer.next = newNode;
      pointer = pointer.next;
    }

    return head.next;
  }

  public static void main(String[] args) {
    Node list = Node.createList(1,2,3,4,5);
    Node.printList(list);
  }
}
