package hw3mikhailov;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);

        myList.printList();
        myList.reverseList();
        System.out.println("");
        myList.printList();
    }
}