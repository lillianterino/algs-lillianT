package wpialgs.apis;

import java.util.Iterator;

/**
 API:
 *     Last-in-First-out
 *     push()/pop()
 *     size()
 *     isEmpty()
 */
public class Stack<E extends Comparable<E>> implements Iterable<E> {

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Instance Variables
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private LinkedList<E> stack;

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructors
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public Stack(){
        stack = new LinkedList<>();
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Private Classes
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private class Node implements Comparable<Node> {
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

    private class StackIterator implements Iterator<E>{
        /** - - - Instance variables - - - - - - - - - - - - - - */
        Node current = peek();

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
    public Node peek() {
        Node n = new Node(stack.getTailData());
        return n;
    }

    public int size(){ return stack.getListLength(); }

    public boolean isEmpty(){ return stack.isEmpty(); }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Mutator Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public void push(E e){
        stack.insertAtTail(e);
    }

    public Node pop(){
        if(stack.isEmpty()){
            return null;
        } else {
            Node removed = new Node(stack.getTailData());
            stack.removeLast();
            return removed;
        }
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Implementations
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    @Override
    public String toString() { return stack.toString(); }

    @Override
    public Iterator<E> iterator() { return new StackIterator(); }

}
