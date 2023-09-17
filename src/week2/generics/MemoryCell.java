package week2.generics;

public class MemoryCell<T extends Comparable<T>> implements Comparable<MemoryCell<T>> {

    private T storedValue;

    public T read() {
        return storedValue;
    }

    public void write(T x) {
        this.storedValue = x;
    }

    @Override
    public int compareTo(MemoryCell<T> o) {
        if (storedValue == null) {
            return 0;
        }
        return storedValue.compareTo(o.read());
    }
}
