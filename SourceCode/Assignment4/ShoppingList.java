package exercises;
import java.util.*;
public class ShoppingList implements Searchable {
    LinkedList<Product> list = new LinkedList<>();

    public ShoppingList(String name, Double price, Integer quantity){
        addItem(name, price, quantity);
    }
    public void addItem(String name, Double price, Integer quantity){
        list.add(new Product(price, quantity, name));
    }

    @Override
    public Double getTotalByName(String name){
        Double x = 0.0;
        for (Product product : list) {
            if(product.getName().contains(name))
                x += product.getTotal();
        }

        return x;
    }

    @Override
    public LinkedList<Product> searchByName(String name)
    {
        LinkedList<Product> newList = new LinkedList<>();

        for (Product product : list) {
            if(product.getName().contains(name))
                newList.add(product);
        }

        return newList;
    }

    @Override
    public LinkedList<Product> searchSmaller(Double price){
        LinkedList<Product> newList = new LinkedList<>();

        for (Product product : list) {
            if(product.getTotal() < price)
                newList.add(product);
        }

        return newList;
    }


    @Override
    public LinkedList<Product> searchGreaterOrEqual(Double price)
    {
        LinkedList<Product> newList = new LinkedList<>();

        for (Product product : list) {
            if(product.getTotal() >= price)
                newList.add(product);
        }

        return newList;
    }
}