package exercises;

public class Product {
    private Double price;
    private Integer quantity;
    private String name;

    public Product(Double p, Integer q, String n)
    {
        price = p;
        quantity = q;
        name = n;
    }

    public Double getTotal(){
        return price * quantity;
    }

    public String getName(){
        return name;
    }
}