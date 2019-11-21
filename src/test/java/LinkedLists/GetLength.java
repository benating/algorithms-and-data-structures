package LinkedLists;

import org.junit.jupiter.api.Test;

public class GetLength {

    @Test
    void validTest() {
         Node head = new Node(0);
         head.appendToTail(1);
         head.appendToTail(2);
         head.appendToTail(3);

         assert (Node.getLength(head) == 4);
    }

    @Test
    void validTest1() {
        Node head = new Node(0);
        assert (Node.getLength(head) == 1);
    }
}
