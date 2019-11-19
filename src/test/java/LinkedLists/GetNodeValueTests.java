package LinkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetNodeValueTests {
    static Node head = new Node(0);

    @BeforeAll
    public static void init() {
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        Node.printNodes(head);
    }

    @Test
    void validTest1() {
        Node n;
        try {
            n = Node.getNode(head, 3);
            assert (n.data == 3);
        } catch (NodeNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void invalidTest1() {
        assertThrows(NodeNotFoundException.class, () -> Node.getNode(head, 10));
    }
}
