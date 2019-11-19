package LinkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeleteNodeTests {
    static Node head = new Node(0);

    @BeforeEach
    public void initEach() {
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        Node.printNodes(head);
    }

    @Test
    void shouldRemoveTheNodeFromTheList() {
        head = Node.deleteNode(head, 2);
        assert (head.data == 0);
        Node.printNodes(head);
        assertThrows(NodeNotFoundException.class, () -> Node.getNode(head, 2));
    }

    @Test
    void shouldRemoveTheNodeFromTheListEvenWhenIsTheLast() {
        head = Node.deleteNode(head, 5);
        assert (head.data == 0);
        Node.printNodes(head);
        assertThrows(NodeNotFoundException.class, () -> Node.getNode(head, 5));
    }

    @Test
    void shouldRemoveTheNodeFromTheListEvenWhenIsTheFirst() {
        head = Node.deleteNode(head, 0);
        assert (head.data == 1);
        Node.printNodes(head);
        assertThrows(NodeNotFoundException.class, () -> Node.getNode(head, 0));
    }
}
