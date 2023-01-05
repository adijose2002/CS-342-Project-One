import java.util.*;

public class GLLIterator < T > implements Iterator < T > {

    private GenericList < T > .Node < T > current;

    public GLLIterator(GenericList < T > .Node < T > head) {
        current = head;
    }

    public boolean hasNext() {
        if (current != null) {
            return true;
        } else {
            return false;
        }
    }

    public T next() {
        if (hasNext()) {
            T data = current.data;
            current = current.next;
            return data;
        }
        return null;
    }
}