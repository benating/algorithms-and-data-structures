package LinkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTests {
    static Node head = new Node(0);

    @BeforeAll
    public static void init() {
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
    }

    @Test
    void validTest1() {
        Node.printNodes(head);
        head = Node.removeDuplicates(head);
        System.out.println("---------");
        Node.printNodes(head);
        assert (!true);
    }
}
