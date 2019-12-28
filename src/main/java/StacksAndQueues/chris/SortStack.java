package StacksAndQueues.chris;

public class SortStack implements Stack<Integer> {

  private DefaultStack<Integer> stack = new DefaultStack<>();
  private DefaultStack<Integer> buffer = new DefaultStack<>();

  @Override
  public void push(Integer data) {
    boolean isPushed = false;

    while (!stack.isEmpty()) {
      if(stack.peek() > data && !isPushed) {
        buffer.push(data);
        isPushed = true;
      } else {
        buffer.push(stack.pop());
      }
    }

    if(!isPushed) {
      buffer.push(data);
    }

    while (!buffer.isEmpty()) {
      stack.push(buffer.pop());
    }
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  @Override
  public Integer pop() {
    return stack.pop();
  }

  @Override
  public Integer peek() {
    return stack.peek();
  }

  public static void main(String[] args) {
    SortStack stack = new SortStack();
    stack.push(5);
    stack.push(3);
    stack.push(4);
    stack.push(10);
    stack.push(1);
    System.out.println("----------------------");
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
