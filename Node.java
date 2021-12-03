/** Node class to be used in a linked list. */
public class Node<T> {

    /** The given element to be stored */
    private T element;

    /** The node that this points to */
    private Node<T> next;

    /** Constructs a node that stores the given element. */
    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    /** Returns the element stored at this node. */
    public T getElement() {
        return element;
    }

    /** Gets the node that this points to. */
    public Node<T> getNext() {
        return next;
    }

    /** Sets the node that this should point to. */
    public void setNext(Node<T> node) {
        this.next = node;
    }
}
