package wpialgs.apis;

import java.util.Iterator;

public class Bag<E extends Comparable<E>> implements Iterable<E> {

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Instance Variables
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private LinkedList<E> bag;

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructors
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public Bag() {
        bag = new LinkedList<>();
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Private Classes
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private class Node implements Comparable<Node>{
        /** - - - Instance variables - - - - - - - - - - - - - - */
        private Node next;

        private E element;

        /** - - - Constructors - - - - - - - - - - - - - - - - - */
        public Node(){
            next = null;
            element = null;
        }

        public Node(E e){
            next = null;
            element = e;
        }

        public Node(E e, Node n){
            next = n;
            element = e;
        }

        /** - - - Accessor Methods - - - - - - - - - - - - - - - */
        public Node getNext(){
            return next;
        }

        public E getElement(){
            return element;
        }

        /** - - - Mutator Methods - - - - - - - - - - - - - - - -*/
        public void setNext(Node n) {
            next = n;
        }

        public void setElement(E e){
            element = e;
        }

        /** - - - Implementations - - - - - - - - - - - - - - - */
        @Override
        public String toString() { return ""; }

        @Override
        public int compareTo(Node o) { return 0; }

    }

    private class BagIterator implements Iterator<E> {
        /** - - - Instance variables - - - - - - - - - - - - - - */
        Node current;

        /** - - - Implementations - - - - - - - - - - - - - - - */
        @Override
        public boolean hasNext(){ return current != null;}
        @Override
        public E next(){
            E curr = current.getElement();
            current = current.getNext();
            return curr;
        }
        @Override
        public void remove(){ }

    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Accessor Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public boolean isEmpty(){ return isEmpty(); }

    public int size(){ return bag.getListLength(); }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Mutator Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public void add(E e){
        bag.insertAtTail(e);
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Implementations
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    @Override
    public String toString() {
        return bag.toString();
    }

    @Override
    public Iterator<E> iterator() { return new BagIterator(); }

}
