import java.util.Iterator;

/** Used to iterate through a Deque */
public class DequeIterator<T> implements Iterator<T> {

    /** A node. */
    private Node<T> node;

    /** Constructs the given node */
    public DequeIterator(Node<T> node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return (node != null);
    }

    @Override
    public T next() {
        T nextEl = node.getElement();
        node = node.getNext();
        return nextEl;
    }
}
