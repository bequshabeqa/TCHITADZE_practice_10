import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");

        Collections.sort(names);

        int index = 0; // Initialize the index
        while (index < names.size()) { // Continue while the index is less than the size of the list
            System.out.println(names.get(index)); // Print the current name
            index++;
        }
    }
}
