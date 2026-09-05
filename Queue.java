package wpialgs.apis;

import java.util.Iterator;

public class Queue<E extends Comparable<E>> implements Iterable<E> {

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Instance Variables
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private LinkedList<E> queue;

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructors
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public Queue() {
        queue = new LinkedList<>();
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

    private class HeapIterator implements Iterator<E>{
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
    public boolean isEmpty(){ return queue.isEmpty(); }

    public int size(){ return queue.getListLength(); }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Mutator Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public void enqueue(E item){
        queue.insertAtTail(item);
    }

    public Node dequeue(){
        if(isEmpty()){
            return null;
        } else {
            Node n = new Node(queue.getHeadData());
            queue.removeFirst();
            return n;
        }
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Implementations
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    @Override
    public String toString() {
        return queue.toString();
    }

    @Override
    public Iterator<E> iterator() { return new HeapIterator(); }

}
