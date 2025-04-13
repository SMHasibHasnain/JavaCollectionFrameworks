import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class InitiatingCopyOnWriteArrayList {
    public static void main(String[] args) {
        //Make Copy When start modifying list, thread safe, fast, better than vector
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.addIfAbsent("A");
        list.addAllAbsent(List.of("C", "D", "E"));
        System.out.println(list);
    }
}
