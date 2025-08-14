package exercises;

import java.util.*;
/* 
Lets focus on the three set operations union, intersection and difference, to the two given member sets in the class.

Now a class `SetOperations` has:

- Add private members `HashSet<Integer> set1` and `HashSet<Integer> set2`.

- Implement the constructor `SetOperations(HashSet<Integer> s1, HashSet<Integer> s2)`, which will initialize the two member sets `set1` and `set2`.

- Implement the method `public HashSet<Integer> union()`, which returns the union of the member sets.

- Implement the method `public HashSet<Integer> intersection()`, which returns the union of the member sets.

- Implement the method `public HashSet<Integer> difference()`, which returns the difference of the member sets.

Hints:

- Use the class `HashSet` instead the interface `Set`.

- If you are not familiar with Set Theory, you should study the basic set operations briefly in the Internet.
*/

public class SetOperations {
    HashSet<Integer> set1;
    HashSet<Integer> set2;

    public SetOperations(HashSet<Integer> _set1,HashSet<Integer> _set2){
        set1 = _set1;
        set2 = _set2;
    }

    public HashSet<Integer> union(){
       HashSet<Integer> test = set1;
       test.addAll(set2);
       return test; 
    }

    public HashSet<Integer> intersection(){
        HashSet<Integer> test = set1;
        test.retainAll(set2);
        return test; 
    }

    public HashSet<Integer> difference(){
        HashSet<Integer> test = set1;
        test.removeAll(set2);
        return test; 
    }
}