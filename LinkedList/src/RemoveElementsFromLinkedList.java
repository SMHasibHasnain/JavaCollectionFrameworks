import java.util.LinkedList;
import java.util.List;

public class RemoveElementsFromLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(3, 4, 7, 5, 6, 4, 2, 9, 3, 3, 3, 5, 4));
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.removeFirstOccurrence(3);
        System.out.println(list);

        list.removeLastOccurrence(3);
        System.out.println(list);

        list.pop();
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<Integer>(List.of(45, 34, 32, 3 ,3, 4, 5, 54));
        list.removeAll(list2);

        list2.clear();
    }
}
