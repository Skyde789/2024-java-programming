package exercises;

import java.util.Vector;
/*
Let's continue our exploration with the Fibonacci sequence.

The class `Fibonacci` has:

- private member `Vector<Integer>`, a collection storing the sequence.

- Constructor with Integer parameter. It will initialize the Fibonacci sequence into the private Vector collection. If this parameter is 8, you will need to calculate and store the first 8 Fibonacci numbers into the collection. It is tested that the collection actually has this sequence.

- Getter for the private collection, i.e. method `getNumbers()`.

- Method `addNext()` which will calculate and add the next Fibonacci number into the collection and return it. 

- Method `isFibonacci(Integer num)` which will check if the given number is a Fibonacci number. Additionally, this method will add the missing Fibonacci sequence until the `num` into the collection. 

- Method `compareSequence(Vector<Integer> seq)` that will check (true / false) if the given sequence is a Fibonacci sequence. Again, similarly this method will add the missing sequence between to the collection. Last number in the updated sequence is the largest Fibonacci number equal or smaller than the largest number in `seq`. 

Hints:

- If the collection sequence is `{0, 1, 1, 2, 3 }` and when next is added, it will become `{0, 1, 1, 2, 3, 5 }`.

- If the sequence is `{0, 1, 1, 2, 3, 5}` and parameter to be checked  for Fibonacci number is 22, the sequence will be updated to `{0, 1, 1, 2, 3, 5, 8, 13, 21}`.

- If the current sequence is `{0, 1, 1, 2, 3, 5, 8, 13}` and the sequence to be checked is `{5, 8, 13, 21, 34, 55, 999}`, the collection will be updated to `987` as the last number.
 */
public class Fibonacci {
    private Vector<Integer> sequence = new Vector<Integer>();
    public Vector<Integer> getNumbers() { return sequence; }

    public Fibonacci(Integer init){
        if(init <= 0)
            return;

        for(int i = 0; i < init; i++)
        {

            addNext();
        }

    }
    Boolean compareSequence(Vector<Integer> seq){
        isFibonacci(seq.get(seq.size()-1).intValue());
        
        return sequence.containsAll(seq);
    }

    Integer addNext()
    {
        Integer x = 0;

        if(sequence.size()-1 == 0)
        {
            x = 1;
            sequence.add(x);
            return x;
        }

        if(sequence.size() -2 >= 0)
            x += sequence.elementAt(sequence.size()-2);
        if(sequence.size() -1 >= 0)
            x += sequence.elementAt(sequence.size()-1);

        sequence.add(x);
        System.out.println(x);
        return x;
    }

    Boolean isFibonacci(Integer num){
        if (sequence.size()-1 >= 0) 
            if (sequence.get(sequence.size()-1).intValue() > num.intValue()) 
                sequence.clear();

        if (sequence.size()-1 < 0) 
            addNext();

        while (sequence.get(sequence.size()-1).intValue() < num.intValue())  {
                addNext();
        }

        System.out.println(num + " | " + sequence.get(sequence.size()-1) + " | " + (num.intValue() == sequence.get(sequence.size()-1).intValue()));
        return num.intValue() == sequence.get(sequence.size()-1).intValue();
    }
}