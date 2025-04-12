import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //1. Adding data in default
        list.add("HA");
        list.add("IB");

        System.out.println(list); //[HA, IB]

        //2. Adding data in a given index
        list.add(1, "S");

        System.out.println(list); //[HA, S, IB]

        //3. Adding multiple data at once
        list.addAll(Arrays.asList("Mango", "Orange")); //[HA, S, IB, Apple, Banana, Mango, Orange]
        Collections.addAll(list, "Cow", "Dog");

        System.out.println(list);

        //4. Adding elements of another arraylist
        ArrayList<String> list2 = new ArrayList<>(List.of("Hasib", "Hamim"));
        list.addAll(list2);

        System.out.println(list);
    }
}
