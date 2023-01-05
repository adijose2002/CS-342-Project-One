import java.util.*;

public class ReverseGLLIterator < T > implements Iterator < T > {

    private ArrayList < T > arrayList;
    private T current;
    private int index;

    public ReverseGLLIterator(GenericList < T > list) {
        arrayList = list.dumpList();
        index = (arrayList.size()) - 1;
        current = arrayList.get(index);
    }

    public boolean hasNext() {

        if (index == -1) {
            return true;
        } else {
            return false;
        }
    }

    public T next() {
        T data = current;
        index = index - 1;
        if (index >= 0) {
            current = arrayList.get(index);
        }

        return data;
    }
}