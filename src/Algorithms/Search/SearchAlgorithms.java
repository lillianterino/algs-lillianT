package algs_lillianT.src.Algorithms.Search;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class SearchAlgorithms {

    public <E extends Comparable<E>> int linearSearch(Iterable<E> list, E key){
        int index = 0;
        for(E item : list){
            if(item.compareTo(key) == 0){
                return index;
            }
            index++;
        }
        return -1;
    }

    public <E extends Comparable<E>> int binarySearch(List<E> list, E key){

        if(!(list instanceof RandomAccess)){
            throw new IllegalArgumentException("list is not a random access collection");
        }

        int lo = 0;
        int hi = list.size()-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(list.get(mid).compareTo(key) > 0){
                lo = mid+1;
            } else if (list.get(mid).compareTo(key) < 0){
                hi = mid-1;
            } else {
                return mid;
            }
        }

        return -1;

    }

}
