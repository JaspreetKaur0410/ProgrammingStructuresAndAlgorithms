/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;


public class LinkedList {
   


    Node front, rear;
    private int currentSize;

    public LinkedList() {
        this.front = null;
        this.rear = null;
        this.currentSize = 0;
    }

    public void enqueue(Student student) {
        Node oldRear = rear;
        rear = new Node();
        rear.student = student;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(student + " added to the queue");
    }

    public Student dequeue() {
        Student data = front.student;
        front = front.next;
        if (isEmpty()) {
            rear = null;
            return null;
        }
        currentSize--;
        System.out.println(data + " removed from the queue");
        return data;
    }

    public void print(Node rear) {

        if (isEmpty()) {
            System.out.println("The linked list is empty!!");
        } else {
            Node node = rear;
            while (node.next != null) {
                System.out.print(node.student + "->");
                node = node.next;
            }
            System.out.print(node.student);
        }
    }

    public Boolean isEmpty() {
        return (currentSize == 0);
    }

    public void reverseList() {
        Node prev = null;
        Node current = front;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        print(prev);
    }

    public void printList() {
        Node prev = null;
        Node current = rear;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        print(prev);
    }

}


