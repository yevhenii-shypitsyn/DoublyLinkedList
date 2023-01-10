public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //Add nodes to the list
        doublyLinkedList.addNodeToEnd(10);
        doublyLinkedList.addNodeToEnd(20);
        doublyLinkedList.addNodeToBeginning(30);
        doublyLinkedList.addNodeToEnd(40);
        doublyLinkedList.addNodeToBeginning(50);

        //print the nodes of main.DoublyLinkedList
        doublyLinkedList.printNodes();
    }
}
