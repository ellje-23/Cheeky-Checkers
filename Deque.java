import java.util.Iterator;

/** A deque is a double-ended queue: it's like a queue, but you can add or remove elements from either end */
public class Deque<T> implements Iterable<T> {

    /** Reference to the start of a list. */
    private Node<T> head;

    /** Reference to the end of a list. */
    private Node<T> tail;

    /** Number of elements in the list. */
    private int size;

    /** Constructs a new, empty list with head and tails a. */
    public Deque() {
        head = null;
        tail = null;
        size = 0;
    }

    /** Returns true if the list is empty, false otherwise. */
    public boolean isEmpty() {
        return (size == 0);
    }

    /** Adds an element to the front of the list.
     * @param element       the element to be added to the front of the list
     */
    public void addFront(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail =newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    /** Removes an element from the front of the list, returning it. */
    public T removeFront() {
        T elementRemoved = head.getElement();
        head = head.getNext();
        size--;
        return elementRemoved;
    }

    /** Returns the number of elements in the list. */
    public int size() {
        return this.size;
    }

    /** Gets the node at the given place. */
    private Node<T> at(int place) {
        Node<T> tmp = head;
        int i = 0;
        while (i < place) {
            tmp = tmp.getNext();
            i++;
        }
        return tmp;
    }

    /** Returns the list as a string. */
    public String toString() {
        String r = "<";
        // Iterates over the list, adding elements to the string.
        Node<T> tmp = head;
        while (tmp != null) {
            r += tmp.getElement();
            // If there's a next element, adds a comma.
            if (tmp.getNext() != null) {
                r += ", ";
            }
            // Advance to next element.
            tmp = tmp.getNext();
        }
        r += ">";
        return r;
    }

    /** Adds an element to the back of the list.
     * @param element       the element to be added to the back of the list
     */
    public void addBack(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail = at(size - 1);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /** Removes an element from the back of the list, returning it. */
    public T removeBack() {
        T elementRemoved = tail.getElement();
        Node<T> secondLast;
        if (size == 1) {
            head = null;
        }
        else {
            secondLast = at(size - 2);
            tail = secondLast;
            secondLast.setNext(null);
        }
        size--;
        return elementRemoved;
    }

    @Override
    public Iterator<T> iterator() {
        return (new DequeIterator<T>(head));
    }
}
