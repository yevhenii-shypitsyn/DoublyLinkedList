import java.util.ArrayList;

public class DoublyLinkedList {
    Node head, tail = null;
    private ArrayList<Node> nodes;

    public void addNodeToEnd(int data) {

        if (head == null) {
            addNodeToEmptyList(data);
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void addNodeToBeginning(int data) {

        if (head == null) {
            addNodeToEmptyList(data);
        } else {
            Node newNode = new Node(data);
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addNodeToEmptyList(int data){
        if (head == null) {
            Node newNode = new Node(data);
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public ArrayList<Node> getListOfNodes(){
        Node current = head;
        nodes = new ArrayList<Node>();
        while(current != null) {
            nodes.add(current);
            current = current.next;
        }
        return nodes;
    }


    public static class Node{
        int data;
        Node next, previous;

        public Node(int data) {
            this.data = data;
        }
    }
}
