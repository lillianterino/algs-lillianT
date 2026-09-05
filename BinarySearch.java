package wpialgs.apis;

import java.util.Collection;
import java.util.List;

public class BinarySearch<E extends Comparable<E>> {

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructor
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public BinarySearch(){

    }

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Search algorithm
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public <E extends Comparable<E>, C extends List<E>> int search(E key, C collection) {
        int lo = 0;
        int hi = collection.size()-1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(collection.get(mid).compareTo(key) > 0){
                lo = mid + 1;
            } else if (collection.get(mid).compareTo(key) < 0){
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
