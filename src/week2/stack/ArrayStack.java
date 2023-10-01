package week2.stack;

public class ArrayStack<T> {

    private T[] theArray;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 10;
    public ArrayStack() {
        theArray = (T []) new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    /**
     * Test if the stack is logically empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public void makeEmpty() {
        topOfStack = -1;
    }

    public T top() throws Exception {
        if (isEmpty()) {
            throw new Exception("ArrayStack top");
        }
        return theArray[topOfStack];
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("ArrayStack pop");
        }
        topOfStack--;
    }

    public T topAndPop() throws Exception {
        if (isEmpty()) {
            throw new Exception("ArrayStack topAndPop");
        }
        return theArray[topOfStack--];
    }

    public void push(T x) {
        if (topOfStack + 1 == theArray.length) {
            doubleArray();
        }
        theArray[++topOfStack] = x;
    }

    private void doubleArray() {

    }


}
