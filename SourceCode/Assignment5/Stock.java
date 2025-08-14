package oamk.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.*;
import java.util.function.Predicate;

public class Stock {
    private List<Product> products = new LinkedList<Product>();
    private LocalDateTime expireTime; // needed to implement the filter (?)
    private DateTimeFormatter stockFormat; // initialized to yyyy.MM.dd

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public List<Product> reportExpired(LocalDateTime dt) {
        Predicate<Product> expireFilter = n -> 
        {
            if (n.bestBefore().isBefore(dt)) 
                return true;
            else
                return false;
        };
        List<Product> test = products.stream().
                             filter(expireFilter).
                             toList();
    
        return test;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("List of Products\n");
        str.append("----------------\n");

        Double price = 0.0;
        for (Product product : products) {
            str.append(product.formatProduct(DateTimeFormatter.ofPattern("yyyy.MM.dd"))+ "\n");
            price += product.price();
        }

        str.append("-> Total products: " + products.size()+ "\n");
        str.append("-> Total price: " + price+ "\n");

        return str.toString();
    }
}