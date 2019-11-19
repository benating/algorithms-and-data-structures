package LinkedLists;

import java.util.HashMap;

public class Node {
    Node next = null;
    int data;

    public Node (int n) {
        data = n;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    static Node getNode(Node head, int d) throws NodeNotFoundException {
        if(head.data == d) {
            return head;
        }
        Node n = head;
        while (n.next != null) {
            if (n.data == d) {
                return n;
            }
            n = n.next;
        }
        throw new NodeNotFoundException("Could not find node in list");
    }

    static Node removeDuplicates(Node head) {
        HashMap<Integer, Boolean> counter = new HashMap<>();
        Node n = head;
        Node nPrev = head;
        // todo: this is working just need to check that the last one is also being updated
        while (n.next != null) {
            if(counter.get(n.data) != null) {
                nPrev = n;
                n.next = n.next.next;
            } else {
                counter.put(n.data, true);
                nPrev = n;
                n = n.next;
            }
        }
        // also need to check the last node even if it doesnt has a pointer
        System.out.println(nPrev.data);
        System.out.println(n.data);
        System.out.println(counter);
        return head;
    }

    /*
    returns the head of the node without the linked one
     */
    static Node deleteNode(Node head, int d) {
        Node n = head;
        Node prev = head;

        if (n.data == d) {
            return head.next;
        }
        while (n.next != null) {
            if (n.data == d) {
                prev.next = n.next;
                return head;
            }
            prev = n;
            n = n.next;
        }
        return head;
    }

    static Node getLastNode(Node head) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        return n;
    }

    static void printNodes(Node head) {
        Node n = head;
        while (n.next != null) {
            System.out.println("Node Value: " + n.data);
            n = n.next;
        }
        System.out.println("Node Value: " + n.data);
    }
}

