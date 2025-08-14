package exercises;

public abstract class Shape {
    protected String name;

    public Shape(String _name){

    }

    public abstract Double calculateArea();
    

    public String getName(){
        return name;
    }
}