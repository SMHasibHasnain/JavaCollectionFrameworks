import java.util.List;
import java.util.ArrayList;

public class CreatingArrayList {
    public static void main(String[] args) {

        //1. Default Capacity 10
        ArrayList<String> list1 = new ArrayList<>();

        //2. Initial Capacity Customization
        ArrayList<String> list2 = new ArrayList<>(15);


        //Or
        list2.ensureCapacity(55);

        //3. Converting Array to Arraylist via list Of
        List<String> list3 = List.of("a", "b", "c", "d", "e");
        List<String> list4 = new ArrayList<>(list3);

        //Or
        ArrayList<String> list5 = new ArrayList<>(List.of("Hasib", "Hamim"));

        System.out.println(list4);
        System.out.println(list5);

        //4. Creating Sublist
        List<String> sublist = list3.subList(1, 3);
        System.out.println(sublist);

    }
}
