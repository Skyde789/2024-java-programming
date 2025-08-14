package java_basics;

import java.io.Console;

/*
 * Modify the method below to greet all visitors by printing out to console
 * the string "Hello n!" for each of them, where n is the number of visitor,
 * starting from 1.
 */

public class Quest6 {
    public Integer fibonacci(Integer n) {
        if (n == 0)
            return 0;

        int n1 = 1;
        int n2 = n1;
        int n3 = n2;

        for (int i = 2; i < n; i++)
        {  
            n1 = n2 + n3;
            n3 = n2;
            n2 = n1;
            System.out.println(n1);
        }

        return n1;
    }
}