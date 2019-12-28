package StacksAndQueues.chris;

public interface Queue<T> {

  public void add(T data);

  public boolean isEmpty();

  public T poll();

  public T peek();
}
