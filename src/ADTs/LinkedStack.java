package algs_lillianT.src.ADTs;

import algs_lillianT.src.Data_Structures.Node;
import algs_lillianT.src.Data_Structures.SinglyLinkedList;

public class LinkedStack<E extends Comparable<E>> implements Stack<E> {

    private SinglyLinkedList<E> stack;

    public LinkedStack() {}

    @Override
    public void push(E e) {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("IMPLEMENT");
    }

}
