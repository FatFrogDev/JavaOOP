package daily;

import java.util.*;

public class Main {
    // Collections
    public static void main(String[] args) {
        // ArrayLList (parameter used for optimization, declares the initial capacity of the list)
        Collection<Integer> col = new ArrayList<>(100);
        List<Integer> id = new ArrayList<Integer>();

        System.out.println(Optional.ofNullable(id.get(4)));

        col.add(1);
        col.add(17);
        col.add(-21);

        System.out.println(col.size());
        // First iteration mode, using foreach
        for (Integer num : col){
            System.out.println("Value: " + num);
        }

        System.out.println();

        Iterator<Integer> it = col.iterator();

        // Second way with iterables
        while (it.hasNext()){
            System.out.println("Value: " + it.next());
        }

    }
}
