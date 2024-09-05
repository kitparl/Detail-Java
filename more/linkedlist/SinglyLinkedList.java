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

  // Insertion Operation
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

  // Deletion Operation

  // Delete at head
  public void deleteNodeAtHead() {
    if (head != null) {
      head = head.next;
    }
  }

  // Delete Tail
  public void deleteNodeAtTail() {
    Node current = head;
    while (current != null) {
      if (current.next.next == null) {
        current.next = null;
        tail = current;
        break;
      }
      current = current.next;
    }
  }

  // Delete node from middle

  public void deleteNodeFromMiddle() {

    Node current = head;
    Node previous = null;
    int count = 0;

    while (current != null) {
      count++;
      current = current.next;
    }
    current = head;

    System.out.println(count);
    if (count == 1) {
      head = null;
      return;
    }

    int i = 0;
    while (current != null) {
      if (i == count / 2) {
        previous.next = current.next;
        break;
      }
      previous = current;
      current = current.next;
      i++;
    }
  }

  public void deletNodeAtNth(int index) {
    Node current = head;
    int i = 0;
    Node previous = null;

    if (index == 0) {
      this.deleteNodeAtTail();
      return;
    }

    while (current != null) {
      if (i == index) {
        previous.next = current.next;
        break;
      }
      previous = current;
      i++;
      current = current.next;
    }
    current = head;

  }

  // Reverse the linkedlist

  public void reverse() {
    Node current = head;
    Node next = null;
    Node previous = null;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;

      current = next;
    }
    head = previous;
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
    list.addAtHead(2);
    list.print();
    // list.deleteNodeAtHead();
    // list.print();
    // list.deleteNodeAtTail();
    // list.deleteNodeFromMiddle();
    // list.print();
    // list.deleteNodeFromMiddle();
    // list.print();
    // list.deleteNodeFromMiddle();
    // list.print();
    // list.deleteNodeFromMiddle();
    // list.deletNodeAtNth(3);
    // list.deletNodeAtNth(1);
    // list.deletNodeAtNth(0);
    list.print();
    list.reverse();
    list.print();
  }
}

// Merge two sorted liskedlist in sorted oder
// Remove all duplicates in linkedlist
