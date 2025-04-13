import java.util.LinkedList;
import java.util.List;

public class AddElementsInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(List.of(2, 4, 8, 8, 2, 5, 9, 10));
        System.out.println(list);

        list.add(34);
        System.out.println(list);

        list.addFirst(3);
        System.out.println(list);

        list.addLast(5);
        System.out.println(list);

        list.push(67);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>(List.of(23, 45, 39));
        list.addAll(list2);

        System.out.println(list);
    }
}
