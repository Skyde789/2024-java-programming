package exercises;
import java.util.*;

public interface Searchable {
    Double getTotalByName(String name);
    LinkedList<Product> searchByName(String name);
    LinkedList<Product> searchGreaterOrEqual(Double name);
    LinkedList<Product> searchSmaller(Double value);
}