package hw3mikhailov;

public class LinkedList {
    private Node head;
    private Node tail;

    public class Node {
        int value;
        Node next;
        Node previous;
    }
    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }
    }

    public void printList (){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }
    public void reverseList(){
        Node currentNode = head;
        tail = head;
        Node tempNode = new Node();
        while (currentNode != null){
            head = currentNode;
            currentNode = currentNode.next;
            tempNode = head.previous;
            head.previous = head.next;
            head.next = tempNode;
        }
    }
}
