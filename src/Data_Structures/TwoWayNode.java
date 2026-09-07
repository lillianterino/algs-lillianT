package algs_lillianT.src.Data_Structures;

public class TwoWayNode<E extends Comparable<E>> implements Comparable<TwoWayNode<E>> {

    private TwoWayNode<E> next;
    private TwoWayNode<E> prev;
    private E item;

    public TwoWayNode() {
        next = null;
        prev = null;
        item = null;
    }

    public TwoWayNode(E item) {
        next = null;
        prev = null;
        this.item = item;
    }

    public TwoWayNode(TwoWayNode<E> next, TwoWayNode<E> prev, E item) {
        this.next = next;
        this.prev = prev;
        this.item = item;
    }

    public E getItem(){
        return item;
    }

    public TwoWayNode<E> getNext(){
        return next;
    }

    public TwoWayNode<E> getPrev(){
        return prev;
    }

    public void setItem(E value){
        item = value;
    }

    public void setNext(TwoWayNode<E> nextNode){
        next = nextNode;
    }

    public void setPrev(TwoWayNode<E> prevNode){
        prev = prevNode;
    }

    @Override
    public String toString(){
        return item.toString();
    }

    @Override
    public int compareTo(TwoWayNode<E> o) {
        return o.getItem().compareTo(item);
    }


}
