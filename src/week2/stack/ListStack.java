package week2.stack;

public class ListStack<T> {
    private ListNode<T> topOfStack = null;

    /**
     * Test if the stack is logically empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return topOfStack == null;
    }

    public void makeEmpty() {
        topOfStack = null;
    }

    public T top() throws Exception {
        if (isEmpty()) {
            throw new Exception("ListStack top");
        }
        return topOfStack.element;
    }

    public void push(T x) {
        topOfStack = new ListNode<T>(x, topOfStack);
    }
    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("ListStack pop");
        }
        topOfStack = topOfStack.next;
    }

    public T topAndPop() throws Exception {
        if (isEmpty()) {
            throw new Exception("ListStack topAndPop");
        }
        T topItem = topOfStack.element;
        topOfStack = topOfStack.next;
        return topItem;
    }



}

class ListNode<T> {
    public T element;
    public ListNode<T> next;

    public ListNode(T theElement) {
        this(theElement, null);
    }

    public ListNode(T theElement, ListNode<T> n) {
        element = theElement;
        next = n;
    }
}
