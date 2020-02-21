package StacksAndQueues.chris;

// O(n) add and O(1) poll
public class QueueViaStacks<T> implements Queue<T>{

  private DefaultStack<T> queue = new DefaultStack<>();
  private DefaultStack<T> buffer = new DefaultStack<>();

  @Override
  public void add(T data) {
    while (!queue.isEmpty()) {
      buffer.push(queue.pop());
    }

    buffer.push(data);

    while (!buffer.isEmpty()) {
      queue.push(buffer.pop());
    }
  }

  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }

  @Override
  public T poll() {
    return queue.pop();
  }

  @Override
  public T peek() {
    return queue.peek();
  }

  public static void main(String[] args) {
    QueueViaStacks<Integer> queue = new QueueViaStacks<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    System.out.println(queue.poll());
    queue.add(5);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
}
