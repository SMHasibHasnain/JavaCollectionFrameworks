import java.util.ArrayList;
import java.util.List;

public class removeElementsFromArrayList {
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

        if(list.isEmpty()) {
            System.out.println("List is empty");
        }

    }
}
