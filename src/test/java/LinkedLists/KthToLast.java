package LinkedLists;

import org.junit.jupiter.api.Test;

public class KthToLast {
    @Test
    void validTest1() {

        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        Node n = Node.kThToLast(head, 2);

        System.out.println("--------------");
        System.out.println("n.data");
        System.out.println(n.data);
        assert (n.data == 3);
    }
}
