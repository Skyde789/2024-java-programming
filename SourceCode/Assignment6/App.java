package designpatterns;

public class App {

    public static void main(String[] args) {
        Calculator c = new Calculator(5.0);

        Double result = c.add(2.0).multiply(2.0).subtract(2.5).getResult();
        
    }
}