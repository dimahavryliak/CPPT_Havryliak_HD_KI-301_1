package com.company;

public class LinkedList<T extends Numbers> {
    Node<T> head;

    static class Node<T extends Numbers> {
        T data;
        Node<T> next;
        Node(T d)
        {
            data = d;
            next = null;
        }
    }

    public void insert(T data)
    {
        Node<T> new_node = new Node<T>(data);
        new_node.next = null;

        if (this.head == null) {
            this.head = new_node;
        }
        else {
            Node<T> last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
    }

    public void printList()
    {
        Node<T> currNode = this.head;

        System.out.print("LinkedList: \n");

        while (currNode != null) {
            System.out.print(" ");
            currNode.data.PrintInfo();
            currNode = currNode.next;
        }
    }

    public T FindMax() //метод для пошуку максимального об'єкта
    {
        Node<T> maxNode = this.head;
        T data = null;
        while (maxNode.next != null) {
            if(maxNode.data.getDecValue() < maxNode.next.data.getDecValue())
                data = maxNode.data;

            maxNode = maxNode.next;
        }
        return data;
    }
}
