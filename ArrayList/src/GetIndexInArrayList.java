import java.util.ArrayList;
import java.util.List;

public class GetIndexInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(List.of("Hello", "Hello", "World"));

        //Return index of the specified element from beginning
        System.out.println(list.indexOf("Hello"));

        //Return index of the lastly specified element
        System.out.println(list.lastIndexOf("Hello"));
    }
}
