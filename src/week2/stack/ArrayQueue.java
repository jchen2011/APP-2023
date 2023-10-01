package week2.stack;

public class ArrayQueue<T> {
    private T[] theArray;
    private int currentSize;
    private int front;
    private int back;

    private static final int DEFAULT_CAPACITY = 10;
    public ArrayQueue() {
        theArray = (T[]) new Object[DEFAULT_CAPACITY];
        makeEmpty();
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void makeEmpty() {
        currentSize = 0;
        front = 0;
        back = -1;
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("ArrayQueue dequeue");
        }
        currentSize--;

        T returnValue = theArray[front];
        front = increment(front);
        return returnValue;
    }

    public T getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("ArrayQueue getFront");
        }
        return theArray[front];
    }

    public void enqueue(T x) {
        if (currentSize == theArray.length) {
            doubleQueue();
        }
        back = increment(back);
        theArray[back] = x;
        currentSize++;
    }

    private int increment(int x) {
        if (++x == theArray.length) {
            x = 0;
        }
        return x;
    }

    private void doubleQueue() {
        T[] newArray;
        newArray = (T[]) new Object[theArray.length * 2];
        for (int i = 0; i < currentSize; i++, front = increment(front)) {
            newArray[i] = theArray[front];
        }

        theArray = newArray;
        front = 0;
        back = currentSize - 1;
    }
}
