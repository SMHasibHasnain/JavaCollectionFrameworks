import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ShowDataInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(List.of("One", "Two", "Three", "Four", "Five"));

        //Basic Printing
        System.out.println(list);

        //A Specific Element Contains or not
        System.out.println(list.contains("Three"));

        //List Size
        System.out.println(list.size());

        //For Each Method
        System.out.print("(Using ForEach) List items: ");
        for(String x: list) {
            System.out.print(x + " ");
        }

        //Using Iterator
        ListIterator<String> iter = list.listIterator();

            //Go forward
            System.out.println("\nGoing Forward: ");
            while(iter.hasNext()) {
                System.out.print(iter.next() + " ");
            }

            //Coming Backward
            System.out.println("\nGoing Forward: ");
            while(iter.hasPrevious()) {
                System.out.print(iter.previous() + " ");
            }
    }
}
