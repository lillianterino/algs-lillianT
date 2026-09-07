package algs_lillianT.src.Data_Structures;

public interface LinkedList<E,N> extends Iterable<E> {

    N getListHead();

    N getListTail();

    int getListLength();

    boolean isEmpty();

    E getHeadItem();

    E getTailItem();

    void insertAtHead(E item);

    void insertAtTail(E item);

    N findFirstOccurrence(E key);

    N findLastOccurrence(E key);

    void insertBeforeFirstOccurrence(E key, E item);

    void insertBeforeLastOccurrence(E key, E item);

    void insertAfterFirstOccurrence(E key, E item);

    void insertAfterLastOccurrence(E key, E item);

    void replaceFirstOccurrence(E key, E item);

    void replaceLastOccurrence(E key, E item);

    N removeFirstOccurrence(E key);

    N removeLastOccurrence(E key);

    void clearList();

}
