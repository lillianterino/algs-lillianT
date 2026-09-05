package wpialgs.apis;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * API:
 *     head
 *     tail
 *     size
 *
 * @author Lillian Terino
 *
 * @date 01-09-2026
 */
public class LinkedList<E extends Comparable<E>> implements Iterable<E> {

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Instance Variables
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private Node headNode;
    private Node tailNode;
    private int listLength;

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructors
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public LinkedList(){
        headNode = null;
        tailNode = null;
        listLength = 0;
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Private classes
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    private class Node implements Comparable<Node>{

        /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * Instance Variables
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
        private E data;
        private Node nextNode;

        /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         *     Constructors
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
        public Node(){
            data = null;
            nextNode = null;
        }

        public Node(E data, Node nextNode){
            this.data = data;
            this.nextNode = nextNode;
        }

        public Node(E data){
            this.data = data;
            nextNode = null;
        }

        /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         *     Getter Methods
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
        public E getData(){
            return data;
        }

        public Node getNextNode(){
            return nextNode;
        }

        /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         *     Setter Methods
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
        public void setData(E data){
            this.data = data;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         *     Overrides
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
        @Override
        public String toString(){
            return data.toString();
        }

        @Override
        public int compareTo(Node o) {
            return this.data.compareTo(o.getData());
        }

    }

    private class ListIterator implements Iterator<E>{
        private Node current = headNode;

        public boolean hasNext(){
            return current != null;
        }

        public void remove(){

        }

        public E next(){
            E curr = current.getData();
            current = current.getNextNode();
            return curr;
        }
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Accessor Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public int getListLength(){
        return listLength;
    }

    public Node getListHead(){
        return headNode;
    }

    public Node getListTail(){
        return tailNode;
    }

    public E getHeadData(){
        return headNode.getData();
    }

    public E getTailData(){
        return tailNode.getData();
    }

    public boolean isEmpty(){ return listLength == 0; }

    public boolean isFull(){ return false; }

    public Node findNode(E key){
        Node trav = headNode;
        while(trav != null){
            if(trav.getData().equals(key)){
                return trav;
            } else {
                trav = trav.getNextNode();
            }
        }
        return null;
    }

    public void printList(){
        System.out.print(toString());
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Mutator Methods
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public void insertAtHead(E data){
        Node newNode;
        // List is empty
        if(headNode == null){
            headNode = new Node(data,null);
            tailNode = headNode;
        } else {
            newNode = new Node(data,headNode);
            headNode = newNode;
        }
        listLength++;
    }

    public void insertAtTail(E data){
        Node newNode = new Node(data,null);
        // List is empty
        if(tailNode == null){
            tailNode = newNode;
            headNode = tailNode;
        } else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
        listLength++;
    }

    public void insertBefore(E data, E key){

    }

    public void insertAfter(E data, E key){
        Node newNode;
        Node trav = headNode;
        while(trav != null){
            if(trav.getData().equals(key)){
                newNode = new Node(data, trav.getNextNode());
                trav.setNextNode(newNode);
                listLength++;
            }
            trav = trav.getNextNode();
        }
    }

    public Node remove(E key){
        Node target;
        Node trav = headNode;
        Node nextNode;
        Node prevNode;
        while(trav != null){
            if(trav.getData().equals(key)){
                target = trav.getNextNode();
                prevNode = trav;
                prevNode.setNextNode(null);
                headNode = target;
                listLength--;
                return prevNode;
            } else {
                nextNode = trav.getNextNode();
                if (nextNode.getData().equals(key)) {
                    target = nextNode;
                    trav.setNextNode(target.getNextNode());
                    listLength--;
                    return target;
                }
                trav = trav.getNextNode();
            }
        }
        return null;
    }

    public Node removeFirst(){
        if(isEmpty()){
            return null;
        } else {
            Node first = headNode;
            headNode = headNode.nextNode;
            listLength--;
            return first;
        }
    }

    public Node removeLast(){
        if(isEmpty()){
            return null;
        } else if (listLength == 1){
            headNode = null;
            tailNode = null;
            listLength--;
            return null;
        } else {
            Node last = tailNode;
            Node trav = headNode;
            while(trav.getNextNode() != tailNode){
                trav = trav.getNextNode();
            }
            trav.setNextNode(null);
            tailNode = trav;
            listLength--;
            return last;
        }
    }

    public void replaceNode(E data, E key){
        Node newNode = new Node(data);
        Node trav = headNode;
        Node nextNode;
        while(trav != null){
            nextNode = trav.getNextNode();
            if(trav.getData().equals(key)){
                newNode.setNextNode(nextNode);
                trav.setNextNode(null);
                headNode = newNode;
            } else {
                if(nextNode.getData().equals(key)){
                    if(nextNode == tailNode){
                        trav.setNextNode(newNode);
                        tailNode =  newNode;
                        trav = newNode;
                    } else {
                        newNode.setNextNode(nextNode.getNextNode());
                        nextNode.setNextNode(null);
                        trav.setNextNode(newNode);
                    }

                }
            }
            trav = trav.getNextNode();
        }
    }

    public void clear(){
        Node trav = headNode;
        Node nextNode;
        while(trav != null){
            nextNode = trav.getNextNode();
            trav.setNextNode(null);
            trav = nextNode;
            listLength--;

        }
    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Implementations
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    @Override
    public String toString(){
        if(isEmpty()){
            return "[]";
        } else {
            String s = "[";
            Node trav = headNode;
            while (trav != null) {
                s += trav.getData() + ", ";
                trav = trav.getNextNode();
            }
            return s.substring(0, s.length() - 2) + "]";
        }
    }

    @Override
    public Iterator<E> iterator(){
        return new ListIterator();
    }


}
