package algs_lillianT.src.Data_Structures;

public class Node<E extends Comparable<E>> implements Comparable<Node<E>> {

    private Node<E> next;
    private E item;

    public Node(){
        next = null;
        item = null;
    }

    public Node(E value, Node<E> nextNode){
        this.item = value;
        this.next = nextNode;
    }

    public Node(E value){
        this.item = value;
        next = null;
    }

    public E getItem(){
        return item;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setItem(E value){
        item = value;
    }

    public void setNext(Node<E> nextNode){
        next = nextNode;
    }

    @Override
    public String toString(){
        return item.toString();
    }

    @Override
    public int compareTo(Node<E> o) {
        return o.getItem().compareTo(item);
    }

}
