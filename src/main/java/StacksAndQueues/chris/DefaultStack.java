package StacksAndQueues.chris;

public class DefaultStack<T> implements Stack<T> {

  private Node<T> top = null;

  @Override
  public void push(T data) {
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public T pop() {
    if(top == null) {
      throw new RuntimeException("Cannot pop from empty stack");
    }

    T data = top.data;
    top = top.next;

    return data;
  }

  @Override
  public T peek() {
    if(top == null) {
      throw new RuntimeException("Cannot peek from empty Stack");
    }

    return top.data;
  }

  public void print() {
    Node temp = top;

    if(temp != null) {
      System.out.println(temp.data + " (top)");
      temp = temp.next;
    }

    while (temp != null) {
      if(temp.next == null) {
        System.out.println(temp.data + " (bottom)");
      } else {
        System.out.println(temp.data);
      }
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    DefaultStack<Integer> stack = new DefaultStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.print();
    stack.pop();
    stack.print();
    stack.pop();
    stack.print();
    stack.pop();
    stack.print();
  }
}
