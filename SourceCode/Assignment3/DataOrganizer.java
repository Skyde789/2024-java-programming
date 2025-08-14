package exercises;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
/*
Emphasize the use of `List` and `Map` interface implementations focusing on sorting and grouping data.

The class `DataOrganizer` only has the method `HashMap<String, ArrayList<Integer>> groupAndSort(ArrayList<Integer> numbers)`. Note that in the method returns a map with String as the key and ArrayList as the value.

The method groups numbers in the parameter array into two lists within the map:

- Key `Even` returns list of even numbers, sorted in ascending order.

- Key `Odd` returns list of odd numbers, sorted in descending order. */
public class DataOrganizer {

    HashMap<String, ArrayList<Integer>> groupAndSort(ArrayList<Integer> numbers)
    {
        HashMap<String, ArrayList<Integer>> test = new HashMap<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(Integer n : numbers)    
        {
            if(n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }

        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        test.put("Even", even);
        test.put("Odd", odd);

        return test;
    }
}