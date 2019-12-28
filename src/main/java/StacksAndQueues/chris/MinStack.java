package StacksAndQueues.chris;

public class MinStack implements Stack<Integer> {

  private MinStackNode top = null;

  @Override
  public void push(Integer data) {
    if (top == null) {
      top = new MinStackNode(data, data);
      return;
    }

    MinStackNode newNode =
        (data < top.min) ? new MinStackNode(data, data) : new MinStackNode(data, top.min);

    newNode.next = top;
    top = newNode;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public Integer pop() {
    if(isEmpty()) {
      throw new RuntimeException("Cannot pop from empty MinStack");
    }

    int data = top.min;
    top = top.next;
    return data;
  }

  @Override
  public Integer peek() {
    if(isEmpty()) {
      throw new RuntimeException("Cannot pop from empty MinStack");
    }

    return top.min;
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(5);
    minStack.push(4);
    minStack.push(7);
    minStack.push(3);
    minStack.push(10);

    System.out.println(minStack.pop()); // 5 4 7 3
    System.out.println(minStack.peek()); // 5 4 7 3
    System.out.println(minStack.pop()); // 5 4 7
    System.out.println(minStack.pop()); // 5 4
    System.out.println(minStack.pop()); // 5
    System.out.println(minStack.pop()); // Empty Stack
    System.out.println(minStack.pop());
  }
}
