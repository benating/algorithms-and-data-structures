package StacksAndQueues.chris;

public interface Stack<T> {

  public void push(T data);

  public boolean isEmpty();

  public T pop();

  public T peek();
}
