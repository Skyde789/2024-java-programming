package exercises;

import java.util.Vector;

public class App {
    public static void main(String[] args) {
        
        Fibonacci test = new Fibonacci(18);
        System.out.println(test.getNumbers());
        
        test.isFibonacci(267914296);

        test.isFibonacci(14930252);

        Vector<Integer> vec =  new Vector<>();
        vec.add(55);
        vec.add(90);
        vec.add(144);
        test.compareSequence(vec);

        vec.clear();
        vec.add(233);
        vec.add(377);
        vec.add(610);
        vec.add(987);
        test.compareSequence(vec);
    }
}