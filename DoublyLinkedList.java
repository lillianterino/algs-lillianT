package wpialgs.apis;

import java.util.Iterator;

public class DoublyLinkedList<E extends Comparable<E>> implements Iterable<E> {
    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Instance Variables
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private Node head;
    private Node tail;
    private int size;

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructors
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public DoublyLinkedList(Node n){
        head = n;
        tail = n;
        size = 1;
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Private classes
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private class Node implements Comparable<Node>{
        /** - - - Instance variables - - - - - - - - - - - - - - */
        Node next;
        Node prev;
        E item;
        /** - - - Constructors - - - - - - - - - - - - - - - - - */
        public Node(){
            next = null;
            prev = null;
            item = null;
        }
        public Node(E e){
            item = e;
            next = null;
            prev = null;
        }
        public Node(E e, Node n){
            item = e;
            next = n;
            prev = null;
        }
        public Node(E e, Node n, Node p){
            item = e;
            next = n;
            prev = p;
        }
        /** - - - Accessor Methods - - - - - - - - - - - - - - - */
        public Node getNext(){
            return next;
        }
        public Node getPrev(){
            return prev;
        }
        public E getItem(){
            return item;
        }
        /** - - - Mutator Methods - - - - - - - - - - - - - - -  */
        public void setNext(Node n){
            next = n;
        }
        public void setPrev(Node p){
            prev = p;
        }
        public void setItem(E e){
            item = e;
        }
        /** - - - Implementations - - - - - - - - - - - - - - - */
        @Override
        public String toString() { return item.toString(); }
        @Override
        public int compareTo(Node o) {
            E other = o.getItem();
            if(item.compareTo(other) > 0){
                return -1;
            } else if (item.compareTo(other) < 0){
                return 1;
            } else {
                return 0;
            }
        }
    }

    private class DoublyIterator implements Iterator<E>{
        /** - - - Instance variables - - - - - - - - - - - - - - */
        Node current;

        /** - - - Implementations - - - - - - - - - - - - - - - */
        @Override
        public boolean hasNext(){ return false;}
        @Override
        public E next(){ return null;}
        @Override
        public void remove(){ }

    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Accessor Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public Node getHead(){ return head; }

    public Node getTail(){ return tail; }

    public int size(){ return size; }

    public E getHeadItem(){ return head.getItem(); }

    public E getTailItem(){ return tail.getItem(); }

    public boolean isEmpty(){ return size == 0; }

    public boolean isFull(){ return false; }

    public Node findNode(E key){ return null;}

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Mutator Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public void insertAtHead(E item){
        if(head == null){
            head = new Node(item);
            tail = head;
            size++;
        } else {
            Node n = new Node(item, head);
            head.setPrev(n);
            head = n;
            size++;
        }
    }

    public void insertAtTail(E item){
        if(tail == null){
            tail = new Node(item);
            head = tail;
            size++;
        } else {
            Node n = new Node(item, null, tail);
            tail.setNext(n);
            tail = n;
            size++;
        }
    }

    public void insertBefore(E item, E key){
        Node n = new Node(item);
        Node t = head;
        if(size == 0){
            head = n;
            tail = n;
            size++;
        } else {
            while(t.getNext() != null){
                if(t.getItem().equals(key)){
                    n.setNext(t);
                    t = t.getPrev();
                    n.setPrev(t);
                    t.setNext(n);
                    size++;
                }
            }
        }
    }

    public void insertAfter(E item){}

    public Node remove(E key){ return null;}

    public Node removeFirst(){ return null;}

    public Node removeLast(){ return null;}

    public Node replaceNode(E item, E key){ return null;}

    public void clear() {}

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Implementations
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    @Override
    public String toString() { return ""; }
    @Override
    public Iterator<E> iterator() { return new DoublyIterator(); }

}
