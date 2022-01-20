import java.util.NoSuchElementException;

public class QueueCustomer<E> implements MyQueue<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(E data) {
            this.data = data;
            this.next = null;
        }


    }
    @Override
    public boolean add(E o) {
        Node<E> newitem = new Node<>(o);
        if(head == null) {
            tail = newitem;
            head = tail;
        }else {
            tail.next = newitem;
            tail = tail.next;
        }
            size++;

        return true;
    }

    @Override
    public boolean offer(E o) {
        Node<E> newitem = new Node<>(o);
        if(head == null) {
            tail = newitem;
            head = tail;
        }else {
            tail.next = newitem;
            tail = tail.next;
        }
        size++;

        return true;
    }

    @Override
    public E remove() {
        E hand = head.data;
        if(head != null) {
            head = head.next;
        }else{
            throw new NoSuchElementException();
        }
        size--;

        return hand;
    }

    @Override
    public E poll() {

        if(size ==0) {
            return null;
        }
        E hand = head.data;
        head = head.next;
        size--;

        return hand;
    }

    @Override
    public E element() {
        if(size == 0) {
            throw new NoSuchElementException();
        }else
            return head.data;
    }

    @Override
    public E peek() {
        if(size == 0) {
            return null;
        }else
        return head.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }
}
