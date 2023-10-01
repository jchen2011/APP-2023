package week2.stack;

public class ListQueue<T> {
    private ListNode<T> front;
    private ListNode<T> back;
    public ListQueue() {
        front = back = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T x) {
        if (isEmpty()) {
            back = front = new ListNode<T>(x);
        } else {
            back = back.next = new ListNode<T>(x);
        }
    }


    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("ListQueue deque");
        }

        T returnValue = front.element;
        front = front.next;
        return returnValue;
    }

    public T getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("ListQueue getFront");
        }
        return front.element;
    }

    public void makeEmpty() {
        front = null;
        back = null;
    }
}
