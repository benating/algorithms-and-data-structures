package LinkedLists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeleteMiddleNode {

    @Test
    void validTest1() {
        Node head = new Node(0);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        Node.deleteMiddleNode(head);
        int length = Node.getLength(head);
        Node.printNodes(head);
        assert (length == 5);
        assertThrows(NodeNotFoundException.class, () -> Node.getNode(head, 2));
    }

    @Test
    void validTest2() {
        Node head = new Node(0);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        Node.deleteMiddleNode(head);
        int length = Node.getLength(head);
        Node.printNodes(head);
        assert (length == 4);
        assertThrows(NodeNotFoundException.class, () -> Node.getNode(head, 2));
    }
}
