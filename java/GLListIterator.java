import java.util.*;

public class GLListIterator < T > implements ListIterator < T > {

    private ArrayList < T > arrayList;
    private T current;
    private int INDEX;

    GLListIterator(GenericList < T > list, int index) {
        if (index < 0) {
            return;
        } else if (index >= list.getLength()) {
            return;
        }

        INDEX = index;
        arrayList = list.dumpList();
        current = arrayList.get(INDEX);
    }

    public void add(T e) {}
    public void remove() {}
    public void set(T t) {}

    public boolean hasNext() {
        if (INDEX == arrayList.size()) {
            return true;
        } else {
            return false;
        }
    }

    public T next() {
        T data = current;
        INDEX = INDEX + 1;
        if (INDEX < arrayList.size()) {
            current = arrayList.get(INDEX);
        }

        return data;
    }

    public T previous() {
        T data = current;
        INDEX = INDEX - 1;
        if (INDEX >= 0) {
            current = arrayList.get(INDEX);
        }

        return data;
    }

    public boolean hasPrevious() {
        if (INDEX == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int nextIndex() {
        return (INDEX + 1);
    }

    public int previousIndex() {
        return (INDEX - 1);
    }
}