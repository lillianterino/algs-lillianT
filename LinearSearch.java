package wpialgs.apis;

public class LinearSearch<E> {

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Constructor
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public LinearSearch(){}

    /** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     * Search algorithm
     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    public static <E, C extends Iterable<E>> int search(E key, C collection){
        int index = 0;
        for (E item: collection){
            if (item.equals(key)){
                return index;
            }
            index++;
        }
        return -1;
    }

}
