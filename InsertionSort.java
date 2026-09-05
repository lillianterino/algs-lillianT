package wpialgs.apis;

import java.util.List;

public class InsertionSort<E extends Comparable<E>> {

    public InsertionSort() {

    }

    public <C extends List<E>> void sort(C list){
        E temp;
        int n = list.size();
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0 && list.get(j).compareTo(list.get(j-1)) > 0; j--){
                temp = list.get(j);
                list.set(j, list.get(j-1));
                list.set(j-1, temp);
            }
        }
    }

}
