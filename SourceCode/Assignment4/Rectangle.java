package exercises;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle(String _name, Double _length, Double _width){
        super(_name);
        length = _length;
        width = _width;
    }

    @Override
    public Double calculateArea(){
        return length* width;
    }
}