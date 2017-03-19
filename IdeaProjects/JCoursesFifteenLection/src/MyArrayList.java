import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {
    private E[] elements;
    private int index;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public MyArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(E value) {
        if (index == elements.length) {
            growArray();
        }
        elements[index] = value;
        index++;
        size++;
    }

    private void growArray() {
        E[] newArray = (E[]) new Integer[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        elements = newArray;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                if (size == elements.length) {
                    return false;
                }
                return true;
            }

            @Override
            public E next() {
                return null;
            }
        };

    }
}
