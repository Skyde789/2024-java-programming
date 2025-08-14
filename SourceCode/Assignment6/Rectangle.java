package designpatterns;

public class Rectangle implements Shape {
    Double width;
    Double length;

    Double[] params;

    public Rectangle(Double[] _params){
        params = _params;
        if (params.length == 0 || params.length > 2)
            throw new IllegalArgumentException("Number of parameters wrong for rectangle, needs width and length");
        width = params[0];
        length = params[1];
    }

    public Double getArea(){
        return width * length;
    }

    public Double[] getParams(){
        return params;
    }
}