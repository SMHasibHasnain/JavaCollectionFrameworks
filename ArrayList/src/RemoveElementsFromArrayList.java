import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);

        //1. Remove element by value
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        //2. Remove element by index
        list.remove(3);
        System.out.println(list);

        //3. Remove the first element
        list.removeFirst();
        System.out.println(list);

        //4. Remove the last element
        list.removeLast();
        System.out.println(list);

        //5. Remove when condition get matched
        list.removeIf(n -> n%2 == 0);

        //6. Remove all elements
        list.removeAll(list);

        //7. Clear all elements
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list2); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        list2.clear();

        if(list.isEmpty() && list2.isEmpty()) {
            System.out.println("List1 is empty"); //List1 is empty
            System.out.println("List2 is empty"); //List2 is empty
        }

        //8. Remove items from a list which do not belong to a specified collection
        ArrayList<Integer> list3 = new ArrayList<>(List.of(2, 3, 4, 6, 7, 8, 9));
        ArrayList<Integer> validator = new ArrayList<>(List.of(3, 5, 7));
        list3.retainAll(validator);
        System.out.println(list3); //[3, 7]
    }
}
