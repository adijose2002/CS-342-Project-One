import java.util.*;

public abstract class GenericList < T > implements Iterable < T > {

    private Node < T > head;
    private int length;

    @Override
    public Iterator < T > iterator() {
        return new GLLIterator < T > (head);
    }

    public class Node < T > {
        T data;
        Node < T > next;

        public Node(T d) {
            this.data = d;
            this.next = null;
        }
    }

    public void print() {
        Node < T > current = this.head;
        if (current == null) {
            System.out.println("Empty List");
        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public abstract void add(T data);

    public T delete() {
        if (this.head == null) {
            return null;
        }

        Node < T > temp = this.head;
        this.head = this.head.next;
        this.length = this.length - 1;

        if (length == 0) {
            head = null;
        }

        return temp.data;
    }

    public ArrayList < T > dumpList() {
        ArrayList < T > temp = new ArrayList < T > ();
        Node < T > current = this.head;

        if (current == null) {
            return temp;
        }

        while (current != null) {
            temp.add(current.data);
            current = current.next;
        }

        this.head = null;
        this.length = 0;

        return temp;
    }

    public T get(int index) {

        if (index < 0) {
            return null;
        } else if (index >= this.length) {
            return null;
        } else if (this.head == null) {
            return null;
        }

        Node < T > current = this.head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }

        return current.data;
    }

    public T set(int index, T element) {

        if (index < 0) {
            return null;
        } else if (index >= this.length) {
            return null;
        } else if (this.head == null) {
            return null;
        }

        Node < T > current = this.head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }

        T previous = current.data;
        current.data = element;
        return previous;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node < T > getHead() {
        return this.head;
    }

    public void setHead(Node < T > head) {
        this.head = head;
    }

    public ListIterator < T > listIterator(int index) {
        return new GLListIterator < T > (this, index);
    }

    public Iterator < T > descendingIterator() {
        return new ReverseGLLIterator < T > (this);
    }
}
