package java_basics;

/*
 * Create method 'factorial(Integer num)' that calculates the factorial of the given 
 * parameter num, where the value of num must be between 1 and 20. Print out the
 * result to the console. If the value of num is less than 1 or larger than 20,
 * the function prints out string "not allowed".
 * 
 * Note: The method should be public and the return type should be void.
 * 
 * Example output when num is 5:
 * 120
 * 
 * Example output when num is 0:
 * not allowed
 */

public class Quest5 {
    void factorial(Integer num)
    {   
        if (num > 20 || num < 1) {
            System.out.println("not allowed");
            return;
        }
        
        int result = 1;
        for(int x = 1; x <= num; x++)
        {
            result *= x;
        }

        System.out.println(result);
    }
}