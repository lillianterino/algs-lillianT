package algs_lillianT.src.Data_Structures;

import java.util.Iterator;

/**
 * @author Lillian Terino
 */
public class SinglyLinkedList<E extends Comparable<E>> implements LinkedList<E, Node<E>> {

    private Node<E> headNode;
    private Node<E> tailNode;
    private int size;

    public SinglyLinkedList() {}

    @Override
    public Node<E> getListHead() {
        return headNode;
    }

    @Override
    public Node<E> getListTail() {
        return tailNode;
    }

    @Override
    public int getListLength() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null && tailNode == null && size == 0;
    }

    @Override
    public E getHeadItem() {
        if (headNode == null) {
            return null;
        }
        return headNode.getItem();
    }

    @Override
    public E getTailItem() {
        if (tailNode == null){
            return null;
        }
        return tailNode.getItem();
    }

    @Override
    public void insertAtHead(E item) {
        if(isEmpty()){
            headNode = new Node<>(item);
            tailNode = headNode;
        } else {
            Node<E> newNode = new Node<>(item);
            newNode.setNext(headNode);
            headNode = newNode;
        }
        size++;
    }

    @Override
    public void insertAtTail(E item) {
        if(isEmpty()){
            tailNode = new Node<>(item);
            headNode = tailNode;
        } else {
            Node<E> newNode = new Node<>(item);
            tailNode.setNext(newNode);
            tailNode = newNode;
        }
        size++;
    }

    @Override
    public Node<E> findFirstOccurrence(E key) {
        if(isEmpty()){
            return null;
        }
        Node<E> currentNode = headNode;
        while(currentNode != null){
            if(currentNode.getItem().compareTo(key) == 0){
                return currentNode;
            }
        }
        return null;
    }

    @Override
    public Node<E> findLastOccurrence(E key) {
        if(isEmpty()){
            return null;
        } else {
            Node<E> currentNode = headNode;
            Node<E> targetNode = null;
            while(currentNode != null){
                if(currentNode.getItem().compareTo(key) == 0){
                    targetNode = currentNode;
                }
            }
            return targetNode;
        }
    }

    @Override
    public void insertBeforeFirstOccurrence(E key, E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void insertBeforeLastOccurrence(E key, E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void insertAfterFirstOccurrence(E key, E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void insertAfterLastOccurrence(E key, E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void replaceFirstOccurrence(E key, E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void replaceLastOccurrence(E key, E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public Node<E> removeFirstOccurrence(E key) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public Node<E> removeLastOccurrence(E key) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void clearList() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

}
