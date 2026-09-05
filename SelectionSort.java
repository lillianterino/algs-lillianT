package wpialgs.apis;

import java.util.Collection;
import java.util.List;

public class SelectionSort<E extends Comparable<E>> {

    public SelectionSort() {

    }

    public <C extends List<E>> void sort(C list){
        E temp;
        int n = list.size();
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(list.get(j).compareTo(list.get(min)) < 0){
                    min = j;
                }
                temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }

}
