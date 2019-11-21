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

    static int getLength(Node head) {
        if(head.next == null) {
            return 1;
        }
        int counter = 1;
        Node n = head;
        while (n.next != null) {
            counter += 1;
            n = n.next;
        }
        return counter;
    }

    static Node kThToLast(Node head, int k) {
        int length = Node.getLength(head);
        int index = length - k;
        System.out.println(length);
        System.out.println(index);
        Node n = head;

        while (n.next != null) {
            if (index == 1) return n;
            else {
                index--;
                n = n.next;
            }
        }
        return head;
    }

    static Node removeDuplicates(Node head) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        Node n = head.next;
        Node newHead = new Node(head.data);

        map.put(head.data, true);

        while (n.next != null) {
            if (map.get(n.data) == null) {
                map.put(n.data, true);
                newHead.appendToTail(n.data);
            }
            n = n.next;
        }

        // we also need to do the check for the last node
        if (map.get(n.data) == null) {
            newHead.appendToTail(n.data);
        }
        return newHead;
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

