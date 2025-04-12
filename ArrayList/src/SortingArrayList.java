import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(43, 52, 13, 34, 11, 98));
        //Sorting using collections sort
        Collections.sort(list);
        System.out.println(list);

        //Reverse Sorted arraylist using collection reverse
        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(43, 52, 13, 34, 11, 98));
        //Sorting using sort method
        list2.sort(null);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>(List.of(43, 52, 13, 34, 11, 98));
        //Reverse Sorting using sort method
        list3.sort(Collections.reverseOrder());
        System.out.println(list3);

    }
}
