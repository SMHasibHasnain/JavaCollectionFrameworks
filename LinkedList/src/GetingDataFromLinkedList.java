import java.util.LinkedList;
import java.util.List;

public class GetingDataFromLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(34, 32, 45, 43, 43, 32, 45, 56));
        System.out.println(list.get(3));
        System.out.println(list.contains(32));
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
