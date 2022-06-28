package utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {

    public static <T> List<T> asListedSorted (List<T> list, Comparator<T> comparator) {   
        Collections.sort(list, comparator);

        return list;
        
       
    }
}
