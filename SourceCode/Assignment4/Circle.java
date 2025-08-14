package exercises;

public class Circle extends Shape{
    private Double radius;
    
    public Circle(String _name, Double _radius){
        super(_name);
        radius = _radius;
    }

    @Override
    public Double calculateArea(){
        return Math.PI * radius * radius;
    }
}