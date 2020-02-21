package StacksAndQueues.chris;

public class DefaultQueue<T> implements Queue<T> {

  private Node<T> top = null;
  private Node<T> bottom = null;

  @Override
  public void add(T data) {
    Node newNode = new Node(data);

    if(bottom == null) {
      bottom = newNode;
      top = newNode;
      return;
    }

    if (top == bottom) {
      bottom.next = newNode;
    } else {
      top.next = newNode;
    }
    top = newNode;
  }

  @Override
  public boolean isEmpty() {
    return bottom == null;
  }

  @Override
  public T poll() {
    if (bottom == null) {
      throw new RuntimeException("Cannot poll from empty queue");
    }

    T data = bottom.data;
    bottom = bottom.next;
    if(bottom == null) {
      top = null;
    }

    return data;
  }

  @Override
  public T peek() {
    if(bottom == null) {
      throw new RuntimeException("Cannot peek form empty Queue");
    }

    return bottom.data;
  }

  public void print() {
    Node temp = bottom;

    while (temp != null) {
      if(temp == bottom) {
        System.out.println(temp.data + " (bottom)");
      } else if(temp == top) {
        System.out.println(temp.data + " (top)");
      }
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    DefaultQueue<Integer> queue = new DefaultQueue<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.print();
    System.out.println(queue.poll());
    queue.print();
    System.out.println(queue.poll());
    queue.print();
    System.out.println(queue.poll());
    queue.print();
  }
}
