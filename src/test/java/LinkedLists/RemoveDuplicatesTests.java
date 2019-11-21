package LinkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTests {

    @Test
    void validTest1() {

        Node head = new Node(0);

        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(3);


        head = Node.removeDuplicates(head);
        int length = Node.getLength(head);
        assert (length == 5);
    }

    @Test
    void whenLastNodeIsNotADuplicate() {

        Node head = new Node(0);

        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(5);


        head = Node.removeDuplicates(head);
        int length = Node.getLength(head);
        assert (length == 6);
    }
}
