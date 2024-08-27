public class SinglyLinkedList {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head = null;
  public Node tail = null;

  // add at tail
  public void addNode(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  // add at head
  public void addAtHead(int data) {
    Node newNode = new Node(data);
    if (tail == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  // add at nth

  public void addAtNth(int index, int data) {
    Node newNode = new Node(data);
    Node current = head;
    int i = 0;

    Node previos = current;
    Node forward = current;
    while (current != null) {
      if (i == index) {
        forward = current.next;
        previos.next = newNode;
        newNode.next = forward;
        break;
      }
      i++;
      previos = current;
      current = current.next;
    }

  }

  public void print() {
    Node current = head;
    if (head == null) {
      System.out.println("Empty List");
      return;
    }
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addNode(1);
    list.addNode(2);
    list.addNode(3);
    list.addAtHead(3);
    list.addAtNth(2, 9);
    list.print();
  }
}
