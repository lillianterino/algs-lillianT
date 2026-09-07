package algs_lillianT.src.Algorithms.Sort;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class SortAlgorithms {

    public <E extends Comparable<E>> void selectionSort(List<E> list){

        if(!(list instanceof RandomAccess)){
            throw new IllegalArgumentException("list is not a random access collection");
        }

        for(int i = 0; i < list.size(); i++){
            int min = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i).compareTo(list.get(min)) < 0){
                    min = j;
                }
                E t = list.get(i);
                list.set(i, list.get(j));
                list.set(j, t);
            }
        }

    }

    public <E extends Comparable<E>> void insertionSort(List<E> list){

        if(!(list instanceof RandomAccess)){
            throw new IllegalArgumentException("list is not a random access collection");
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                E t = list.get(j);
                list.set(j, list.get(j-1));
                list.set(j-1, t);
            }
        }

    }

    public <E extends Comparable<E>> void bubbleSort(List<E> list){

        if(!(list instanceof RandomAccess)){
            throw new IllegalArgumentException("list is not a random access collection");
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    E t = list.get(i);
                    list.set(j, list.get(j+1));
                    list.set(j+1, t);
                }
            }
        }
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    public <E extends Comparable<E>> void timSort(List<E> list){
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    public <E extends Comparable<E>> void shellSort(List<E> list){

        if(!(list instanceof RandomAccess)){
            throw new IllegalArgumentException("list is not a random access collection");
        }

        int n = list.size();
        int h = 1;
        while(h < n/3){
            h = 3 * h + 1;
        }
        while(h >= 1){
            for(int i = h; i < n; i ++){
                for(int j = i; j >= h && list.get(j).compareTo(list.get(j-h)) < 0; j -= h){
                    E t = list.get(j);
                    list.set(j, list.get(j-h));
                    list.set(j-h, t);
                }
                h = h/3;
            }
        }
    }

    public <E extends Comparable<E>> void mergeSort(List<E> collection){
        throw new UnsupportedOperationException("IMPLEMENT");
    }

    public <E extends Comparable<E>> void quickSort(List<E> collection){
        throw new UnsupportedOperationException("IMPLEMENT");
    }

}
