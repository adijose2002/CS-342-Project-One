import java.util.*;

public class GenericQueue < T > extends GenericList < T > {

    private Node < T > tail;

    GenericQueue(T data) {
        Node < T > node = new Node(data);
        this.setHead(node);
        this.setLength(1);
        tail = node;
    }

    public void add(T data) {
        Node < T > temp = new Node(data);
        if (this.getHead() == null) {
            this.setHead(temp);
        } else {
            tail.next = temp;
        }
        tail = temp;

        this.setLength(this.getLength() + 1);
    }

    public T removeTail() {
        T data = this.delete();
        if (this.getLength() == 0) {
            tail = null;
        }
        return data;
    }

    public void enqueue(T data) {
        add(data);
    }

    public T dequeue() {
        return removeTail();
    }
}