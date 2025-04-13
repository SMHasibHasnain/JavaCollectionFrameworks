import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CreatingLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>(List.of("a", "b", "c"));
        System.out.println(list);

        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList);

        LinkedList<String> linkedList2 = new LinkedList<>(list);
        System.out.println(linkedList2);
    }
}
