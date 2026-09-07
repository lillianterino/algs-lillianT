package algs_lillianT.src.Data_Structures;

import java.util.Iterator;

public class DoublyLinkedList<E extends Comparable<E>> implements LinkedList<E, TwoWayNode<E>> {

    private TwoWayNode<E> headNode;
    private TwoWayNode<E> tailNode;
    private int size;

    public DoublyLinkedList() {}
    
    @Override
    public TwoWayNode<E> getListHead() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public TwoWayNode<E> getListTail() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public int getListLength() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public E getHeadItem() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public E getTailItem() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void insertAtHead(E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public void insertAtTail(E item) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public TwoWayNode<E> findFirstOccurrence(E key) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public TwoWayNode<E> findLastOccurrence(E key) {
        throw new UnsupportedOperationException("IMPLEMENT");
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
    public TwoWayNode<E> removeFirstOccurrence(E key) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public TwoWayNode<E> removeLastOccurrence(E key) {
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
