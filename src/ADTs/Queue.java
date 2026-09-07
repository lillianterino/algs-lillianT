package algs_lillianT.src.ADTs;

import java.util.Iterator;

public interface Queue<E> {

    public void enqueue(E e);

    public E dequeue();

    public E peek();

    public boolean isEmpty();

    public int size();


}
