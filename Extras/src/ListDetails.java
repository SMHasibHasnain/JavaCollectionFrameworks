import java.util.ArrayList;
import java.util.List;

public class ListDetails {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("A", "B", "C", "D", "E", "F", "G", "H"));
//        list.ensureCapacity(); //Error
//        list.trimToSize(); //Error
//        list.clone(); //Error
//        Because, list doesn't contain these methods but a Arraylist does and we are using List as the reference


        ArrayList<String> arraylist = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F", "G", "H"));
        arraylist.ensureCapacity(20); //Correct
        arraylist.trimToSize(); //Correct
        arraylist.clone(); //Correct


//        We can perform down casting for this
//        ((ArrayList<String>) list).trimToSize(); //Will Work
//        ((ArrayList<String>) list).ensureCapacity(); //Will Work
//        ((ArrayList<String>) list).clone(); //Will Work

    }
}
